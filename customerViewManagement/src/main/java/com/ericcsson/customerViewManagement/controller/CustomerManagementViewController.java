package com.ericcsson.customerViewManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ericcsson.customerViewManagement.model.CustomerViewAll;
import com.ericcsson.customerViewManagement.model.CustomerViewIndividual;
import com.ericcsson.customerViewManagement.service.CustomerInfoManagementService;
import com.ericcsson.customerViewManagement.service.CustomerPlanManagementService;


@RestController
@RequestMapping("/dao")
public class CustomerManagementViewController {

	@Autowired
	CustomerInfoManagementService customerInfoManagementService;
	@Autowired
	CustomerPlanManagementService customerPlanManagementService;
	@Autowired
	RestTemplate restTemplate;

	
	@RequestMapping("/all")
	public CustomerViewAll getAllCustomerInfo() {
		CustomerViewAll customerview = new CustomerViewAll();
		customerview.setCustomerInfo(customerInfoManagementService.getCustomers());
		customerview.setCustomerPlan(customerPlanManagementService.getCustomers());
		return customerview;
	}

	@RequestMapping("/customers/{id}")
	public CustomerViewIndividual getCustomer(@PathVariable Integer id) {
		CustomerViewIndividual customerview = new CustomerViewIndividual();
		customerview.setCustomerInfo(customerInfoManagementService.getCustomerInfo(id));
		customerview.setCustomerPlan(customerPlanManagementService.getCustomerPlan(id));
		return customerview;
	}

}
