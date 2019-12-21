package com.ericcsson.customerInfoManagement.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericcsson.customerInfoManagement.model.CustomerInfo;
import com.ericcsson.customerInfoManagement.repository.CustomerRepository;

@Service
public class CustomerInfoManagementService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerInfo> getCustomers() {
		List<CustomerInfo> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Optional<CustomerInfo> getCustomerInfo(Integer id) {
		return customerRepository.findById(id);
	}

	public void addCustomerInfo(CustomerInfo customerInfo) {
		customerRepository.save(customerInfo);
		
	}

	public void updateCustomerInfo(CustomerInfo customerInfo) {
		customerRepository.save(customerInfo);
		
	}

	public void deleteCustomerInfo(Integer id) {
		customerRepository.deleteById(id);
		
	}

}
