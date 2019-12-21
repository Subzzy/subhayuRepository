package com.ericcsson.customerViewManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "CUSTOMERPLAN")
public class CustomerPlan {

	@Id
	@Column(name = "CUSTOMERID")
	@NonNull
	private Integer customerId;

	@Column(name = "ORDERID")
	@NonNull
	private Integer orderId;

	@Column(name = "BASEPLAN")
	@NonNull
	private String basePlan;

	@Column(name = "OPTIONALPLAN")
	private String optionalPlan;

	@Column(name = "ADDONS")
	private String addOns;

	public CustomerPlan() {
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
