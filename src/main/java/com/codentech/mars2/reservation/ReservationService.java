package com.codentech.mars2.reservation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.codentech.mars2.customer.Customer;
import com.codentech.mars2.customer.CustomerService;
import com.fasterxml.jackson.databind.JsonNode;

import com.codentech.mars2.wrapper.Json;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository resRepo;
	
	@Autowired
	private CustomerService cusService;

	public List<Reservation> findAll() {
		return resRepo.findAll();
	}

	public Reservation findOne(Long id) {
		return resRepo.findOne(id);
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Reservation save(JsonNode jsonNode) {
		
		Reservation reservation = Json.fromJson(jsonNode.findPath(Reservation.ROOT_NODE), Reservation.class);
		Customer customer = Json.fromJson(jsonNode.findPath(Customer.ROOT_NODE), Customer.class);
		
		if (reservation.getId() != null) {
			return null;
		}
		
		cusService.saveOrUpdate(customer);
		reservation.setCustomerId(customer.getId()); // ignore and replace Reservation.customerId with Customer.id
		return resRepo.save(reservation);
		
	}
	
	public Reservation update(JsonNode jsonNode) {
		
		Reservation reservation = Json.fromJson(jsonNode.findPath(Reservation.ROOT_NODE), Reservation.class);
		Customer customer = Json.fromJson(jsonNode.findPath(Customer.ROOT_NODE), Customer.class);
		
		if(!resRepo.exists(reservation.getId())) {
			return null;
		}
		
		cusService.update(customer);  // can't save new customer
		reservation.setCustomerId(customer.getId()); // ignore and replace Reservation.customerId with Customer.id
		return resRepo.save(reservation);
		
	}
	
	public void delete(Long id) {
		resRepo.delete(id);
	}
}
