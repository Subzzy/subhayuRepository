package com.ericcsson.customerViewManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="CUSTOMERINFO")
public class CustomerInfo {
	
	@Id
	@NotNull
	@Column(name="CUSTOMERID")
	private Integer customerId;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="ADDRESS")
	private String address;
	
	public CustomerInfo() {
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
	
	

}
