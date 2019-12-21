package com.ericcsson.customerPlanManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ericcsson.customerPlanManagement.model.CustomerPlan;
import com.ericcsson.customerPlanManagement.service.CustomerPlanManagementService;


@RestController
public class CustomerManagementPlanController {
	
	@Autowired
	CustomerPlanManagementService customerPlanManagementService;
	
	@RequestMapping("/all")
	public List<CustomerPlan>  getAllCustomerInfo() {
		return customerPlanManagementService.getCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Optional<CustomerPlan> getCustomer(@PathVariable Integer id) {
		return customerPlanManagementService.getCustomerPlan(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody CustomerPlan customerPlan) {
		customerPlanManagementService.addCustomerPlan(customerPlan);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void updateCustomer(@RequestBody CustomerPlan customerPlan, @PathVariable String id) {
		customerPlanManagementService.updateCustomerPlan(customerPlan);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerPlanManagementService.deleteCustomerPlan(id);
	}

}
