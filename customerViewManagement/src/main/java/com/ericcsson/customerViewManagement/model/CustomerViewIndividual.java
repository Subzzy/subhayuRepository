package com.ericcsson.customerViewManagement.model;

import java.util.Optional;

public class CustomerViewIndividual {
	Optional<CustomerInfo> customerInfo;
	Optional<CustomerPlan> customerPlan;

	public CustomerViewIndividual() {

	}

	public Optional<CustomerInfo> getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(Optional<CustomerInfo> customerInfo) {
		this.customerInfo = customerInfo;
	}

	public Optional<CustomerPlan> getCustomerPlan() {
		return customerPlan;
	}

	public void setCustomerPlan(Optional<CustomerPlan> customerPlan) {
		this.customerPlan = customerPlan;
	}

}
