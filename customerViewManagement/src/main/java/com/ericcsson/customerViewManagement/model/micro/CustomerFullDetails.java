package com.ericcsson.customerViewManagement.model.micro;

public class CustomerFullDetails {

	private Integer customerId;
	private String firstName;
	private String lastName;
	private String address;
	private Integer orderId;
	private String basePlan;
	private String optionalPlan;
	private String addOns;

	public CustomerFullDetails() {
	}

	public CustomerFullDetails(Integer customerId, String firstName, String lastName, String address, Integer orderId,
			String basePlan, String optionalPlan, String addOns) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.orderId = orderId;
		this.basePlan = basePlan;
		this.optionalPlan = optionalPlan;
		this.addOns = addOns;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getBasePlan() {
		return basePlan;
	}

	public void setBasePlan(String basePlan) {
		this.basePlan = basePlan;
	}

	public String getOptionalPlan() {
		return optionalPlan;
	}

	public void setOptionalPlan(String optionalPlan) {
		this.optionalPlan = optionalPlan;
	}

	public String getAddOns() {
		return addOns;
	}

	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}

}
