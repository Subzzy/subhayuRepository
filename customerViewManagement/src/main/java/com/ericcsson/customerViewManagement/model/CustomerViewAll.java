package com.ericcsson.customerViewManagement.model;

import java.util.List;

public class CustomerViewAll {
	List<CustomerInfo> customerInfo;
	List<CustomerPlan> customerPlan;

	public CustomerViewAll() {

	}

	public List<CustomerInfo> getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(List<CustomerInfo> customerInfo) {
		this.customerInfo = customerInfo;
	}

	public List<CustomerPlan> getCustomerPlan() {
		return customerPlan;
	}

	public void setCustomerPlan(List<CustomerPlan> customerPlan) {
		this.customerPlan = customerPlan;
	}

	

}
