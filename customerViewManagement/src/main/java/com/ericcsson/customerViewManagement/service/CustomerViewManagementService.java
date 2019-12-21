package com.ericcsson.customerViewManagement.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericcsson.customerViewManagement.model.CustomerPlan;
import com.ericcsson.customerViewManagement.repository.CustomerPlanRepository;

@Service
public class CustomerViewManagementService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	CustomerPlanRepository customerPlanRepository;

	public List<CustomerPlan> getCustomers() {
		List<CustomerPlan> customers = new ArrayList<>();
		customerPlanRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Optional<CustomerPlan> getCustomerPlan(Integer id) {
		return customerPlanRepository.findById(id);
	}


}
