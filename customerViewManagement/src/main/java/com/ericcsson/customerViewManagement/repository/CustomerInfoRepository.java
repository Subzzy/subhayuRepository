package com.ericcsson.customerViewManagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.ericcsson.customerViewManagement.model.CustomerInfo;

public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, Integer> {

}
