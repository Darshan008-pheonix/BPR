package com.bpr.serviceImpln;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpr.entity.BNPL;
import com.bpr.repo.BNPLRepo;
import com.bpr.service.BNPLService;

@Service
public class BNPLServiceImpln implements BNPLService{
	
	@Autowired
	BNPLRepo r;

	
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

}
