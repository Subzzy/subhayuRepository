package com.ericcsson.customerViewManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ericcsson.customerViewManagement.model.CustomerPlan;

public interface CustomerPlanRepository extends CrudRepository<CustomerPlan, Integer> {

}
