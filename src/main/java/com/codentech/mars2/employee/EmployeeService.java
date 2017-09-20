package com.codentech.mars2.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Employee findOne(Integer id) {
		return employeeRepository.findOne(id);
	}

	public Employee save(Employee employee) {
		
		if (employee.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return employeeRepository.save(employee);
		
	}
	
	public Employee update(Employee employee) {
		
		if(findOne(employee.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}	
		return employeeRepository.save(employee);
		
	}
	
	public void delete(Integer id) {
		employeeRepository.delete(id);
	}
}
