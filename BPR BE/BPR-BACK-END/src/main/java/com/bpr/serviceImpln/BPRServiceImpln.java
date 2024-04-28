package com.bpr.serviceImpln;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpr.entity.AdvanceCustomer;
import com.bpr.entity.BNPL;
import com.bpr.entity.BusinessParcel;
import com.bpr.exception.IdNotFoundException;
import com.bpr.repo.AdvanceRepo;
import com.bpr.repo.BNPLRepo;
import com.bpr.repo.BusinessRepo;

import com.bpr.service.BPRService;
import com.mysql.cj.log.Log;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BPRServiceImpln implements BPRService{
	
	@Autowired
	BNPLRepo r;

	@Autowired
	AdvanceRepo advanceRepo;
	@Autowired
	BusinessRepo businessRepo;
	
	//net amount =speedrev-dis
	//cgst=netamt*0.09;
	//sgst=netamt*0.09
	//grsamt=cgst+sgst+netamt+pant;
	
	public void bnplCalci(BNPL b) {
		
		b.setNetAmt(b.getSpeedRev()-b.getDisAmt());
		b.setCgst(b.getNetAmt()*0.09);
		b.setSgst(b.getNetAmt()*0.09);
		b.setGrossAmt(b.getCgst()+b.getSgst()+b.getNetAmt()+b.getPenalInt());
	}
	
	@Override
	public BNPL bnplEntry(BNPL b) {
		bnplCalci(b);
		b.setDate(new Date());
		return r.save(b);
		
	}
	
	public void advanceCalci(AdvanceCustomer b) {
		
		b.setNetAmt(b.getSpeedRev()-b.getDisAmt());
		b.setCgst(b.getNetAmt()*0.09);
		b.setSgst(b.getNetAmt()*0.09);
		b.setGrossAmt(b.getCgst()+b.getSgst()+b.getNetAmt()+b.getPenalInt());
	}
	

	@Override
	public AdvanceCustomer advanceEntry(AdvanceCustomer a) {
		advanceCalci(a);
		a.setDate(new Date());
		return advanceRepo.save(a);
	}
	
	public void businessCalci(BusinessParcel b) {
		
		b.setNetAmt(b.getSpeedRev()-b.getDisAmt());
		b.setCgst(b.getNetAmt()*0.09);
		b.setSgst(b.getNetAmt()*0.09);
		b.setGrossAmt(b.getCgst()+b.getSgst()+b.getNetAmt()+b.getPenalInt());
	}
	

	@Override
	public BusinessParcel businessEntry(BusinessParcel b) {
		businessCalci(b);
		b.setDate(new Date());
		return businessRepo.save(b);
	}

	@Override
	public BNPL findByIdBNPL(Integer cid) {
		
		// TODO Auto-generated method stub
		return r.findById(cid).orElseThrow(()-> new IdNotFoundException());
	}

	@Override
	public AdvanceCustomer findByIdAdvance(Integer cid) {
		
		return advanceRepo.findById(cid).orElseThrow(()-> new IdNotFoundException());
	}

	@Override
	public BusinessParcel findByIdBP(Integer cid) {
		// TODO Auto-generated method stub
		return businessRepo.findById(cid).orElseThrow(()-> new IdNotFoundException());
	}

	@Override
	public BNPL deleteByIdBNPL(Integer cid) {
		BNPL obj=r.findById(cid).orElseThrow(()-> new IdNotFoundException());
		r.deleteById(cid);
		return obj;
	}

	@Override
	public AdvanceCustomer deleteByIdAdvance(Integer cid) {
		AdvanceCustomer obj=advanceRepo.findById(cid).orElseThrow(()-> new IdNotFoundException());
		advanceRepo.deleteById(cid);
		return obj;
	}

	@Override
	public BusinessParcel deleteByIdBP(Integer cid) {
		BusinessParcel obj=businessRepo.findById(cid).orElseThrow(()-> new IdNotFoundException());
		businessRepo.deleteById(cid);
		return obj;
	}

}