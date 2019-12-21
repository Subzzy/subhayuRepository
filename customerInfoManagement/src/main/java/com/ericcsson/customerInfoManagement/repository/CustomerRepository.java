package com.ericcsson.customerInfoManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ericcsson.customerInfoManagement.model.CustomerInfo;

public interface CustomerRepository extends CrudRepository<CustomerInfo, Integer> {

}
