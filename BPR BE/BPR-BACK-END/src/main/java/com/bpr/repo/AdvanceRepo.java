package com.bpr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpr.entity.AdvanceCustomer;

public interface AdvanceRepo extends  JpaRepository<AdvanceCustomer, Integer>{

}
