package com.codentech.mars2.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Customer findOne(Long id) {
		return customerRepository.findOne(id);
	}

	public Customer save(Customer customer) {
		
		if (customer.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return customerRepository.save(customer);
		
	}
	
	public Customer update(Customer customer) {
		
		if(findOne(customer.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}	
		return customerRepository.save(customer);
		
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Customer saveOrUpdate(Customer customer) {	
		return customerRepository.save(customer);
	}
	
	public void delete(Long id) {
		customerRepository.delete(id);
	}
}
