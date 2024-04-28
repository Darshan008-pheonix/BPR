package com.bpr.service;

import com.bpr.entity.AdvanceCustomer;
import com.bpr.entity.BNPL;
import com.bpr.entity.BusinessParcel;

public interface BPRService {

	BNPL bnplEntry(BNPL b);
	AdvanceCustomer advanceEntry(AdvanceCustomer a);
	BusinessParcel businessEntry(BusinessParcel b);

	BNPL findByIdBNPL(Integer cid);
	AdvanceCustomer findByIdAdvance(Integer cid);
	BusinessParcel findByIdBP(Integer cid);
	
	
	BNPL deleteByIdBNPL(Integer cid);
	AdvanceCustomer deleteByIdAdvance(Integer cid);
	BusinessParcel deleteByIdBP(Integer cid);
	
	
}
