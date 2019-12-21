package com.ericcsson.customerViewManagement.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericcsson.customerViewManagement.model.CustomerInfo;
import com.ericcsson.customerViewManagement.repository.CustomerInfoRepository;

@Service
public class CustomerInfoManagementService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	CustomerInfoRepository customerRepository;

	public List<CustomerInfo> getCustomers() {
		List<CustomerInfo> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Optional<CustomerInfo> getCustomerInfo(Integer id) {
		return customerRepository.findById(id);
	}

}
