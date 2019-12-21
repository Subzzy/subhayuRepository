package com.ericcsson.customerPlanManagement.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericcsson.customerPlanManagement.model.CustomerPlan;
import com.ericcsson.customerPlanManagement.repository.CustomerRepository;

@Service
public class CustomerPlanManagementService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerPlan> getCustomers() {
		List<CustomerPlan> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Optional<CustomerPlan> getCustomerPlan(Integer id) {
		return customerRepository.findById(id);
	}

	public void addCustomerPlan(CustomerPlan customerPlan) {
		customerRepository.save(customerPlan);
		
	}

	public void updateCustomerPlan(CustomerPlan customerPlan) {
		customerRepository.save(customerPlan);
		
	}

	public void deleteCustomerPlan(Integer id) {
		customerRepository.deleteById(id);
		
	}

}
