package com.ericcsson.customerPlanManagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.ericcsson.customerPlanManagement.model.CustomerPlan;

public interface CustomerRepository extends CrudRepository<CustomerPlan, Integer> {

}
