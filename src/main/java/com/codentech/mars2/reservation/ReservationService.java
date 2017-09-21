package com.codentech.mars2.reservation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.codentech.mars2.customer.CustomerService;

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
	public Reservation save(Reservation reservation) {
		
		if (reservation.getId() != null) {
			return null;
		}
		
		cusService.saveOrUpdate(reservation.getCustomer());
		return resRepo.save(reservation);
		
	}
	
	public Reservation update(Reservation reservation) {
		
		if(findOne(reservation.getId()) == null) {
			return null;
		}
		
		cusService.saveOrUpdate(reservation.getCustomer());
		return resRepo.save(reservation);
		
	}
	
	public void delete(Long id) {
		resRepo.delete(id);
	}
}
