package com.ericcsson.customerInfoManagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ericcsson.customerInfoManagement.model.CustomerInfo;
import com.ericcsson.customerInfoManagement.model.CustomerInfoList;
import com.ericcsson.customerInfoManagement.service.CustomerInfoManagementService;


@RestController
public class CustomerManagementInfoController {
	
	@Autowired
	CustomerInfoManagementService customerInfoManagementService;
	
	@RequestMapping("/all")
	public CustomerInfoList  getAllCustomerInfo() {
		CustomerInfoList customerInfoList = new CustomerInfoList();
		customerInfoList.setCustomerInfo(customerInfoManagementService.getCustomers());
		return customerInfoList;
	}
	
	@RequestMapping("/customers/{id}")
	public Optional<CustomerInfo> getCustomer(@PathVariable Integer id) {
		return customerInfoManagementService.getCustomerInfo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody CustomerInfo customerInfo) {
		customerInfoManagementService.addCustomerInfo(customerInfo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void updateCustomer(@RequestBody CustomerInfo customerInfo, @PathVariable String id) {
		customerInfoManagementService.updateCustomerInfo(customerInfo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerInfoManagementService.deleteCustomerInfo(id);
	}

}
