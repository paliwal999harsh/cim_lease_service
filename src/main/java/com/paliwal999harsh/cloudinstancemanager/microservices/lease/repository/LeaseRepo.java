package com.paliwal999harsh.cloudinstancemanager.microservices.lease.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paliwal999harsh.cloudinstancemanager.microservices.lease.model.LeaseEntity;

@Repository
public interface LeaseRepo extends MongoRepository<LeaseEntity, Long>{
    
    LeaseEntity findLeaseByInstanceName(String instanceName);
}
