package com.bpr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bpr.entity.AdvanceCustomer;
import com.bpr.entity.BusinessParcel;

public interface BusinessRepo  extends  JpaRepository<BusinessParcel, Integer>{

}
