package com.ericcsson.customerViewManagement.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.ericcsson.customerViewManagement.model.CustomerInfo;
import com.ericcsson.customerViewManagement.model.CustomerPlan;
import com.ericcsson.customerViewManagement.model.micro.CustomerFullDetails;
import com.ericcsson.customerViewManagement.model.micro.CustomerInfoList;

@RestController
@RequestMapping("/micro")
public class CustomerManagementViewMicroController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/all")
	public List<CustomerFullDetails> getAllCustomerInfoUsingMicroService() {

		List<CustomerFullDetails> listOfAllCustInfo = new ArrayList<CustomerFullDetails>();
		CustomerInfoList customerInfoList = restTemplate.getForObject("http://customer-info-service/all/",
				CustomerInfoList.class);

		for (CustomerInfo customerInfo : customerInfoList.getCustomerInfo()) {
			CustomerPlan customerPlan = restTemplate.getForObject(
					"http://customer-plan-service/customers/" + customerInfo.getCustomerId(), CustomerPlan.class);
			listOfAllCustInfo.add(prepareCombinedResult(customerInfo, customerPlan));
		}

		return listOfAllCustInfo;
	}

	@RequestMapping("/customers/{id}")
	public CustomerFullDetails getCustomer(@PathVariable Integer id) {

		CustomerInfo customerInfo = restTemplate.getForObject("http://customer-info-service/customers/" + id,
				CustomerInfo.class);
		CustomerPlan customerPlan = restTemplate.getForObject("http://customer-plan-service/customers/" + id,
				CustomerPlan.class);

		return prepareCombinedResult(customerInfo, customerPlan);
	}

	private CustomerFullDetails prepareCombinedResult(CustomerInfo customerInfo, CustomerPlan customerPlan) {
		CustomerFullDetails customerFullDetails = new CustomerFullDetails();
		if (customerInfo != null) {
			customerFullDetails.setCustomerId(customerInfo.getCustomerId());
			customerFullDetails.setFirstName(customerInfo.getFirstName());
			customerFullDetails.setLastName(customerInfo.getLastName());
			customerFullDetails.setAddress(customerInfo.getAddress());
		}
		if (customerPlan != null) {
			customerFullDetails.setOrderId(customerPlan.getOrderId());
			customerFullDetails.setBasePlan(customerPlan.getBasePlan());
			customerFullDetails.setOptionalPlan(customerPlan.getOptionalPlan());
			customerFullDetails.setAddOns(customerPlan.getAddOns());
		}

		return customerFullDetails;
	}

}
