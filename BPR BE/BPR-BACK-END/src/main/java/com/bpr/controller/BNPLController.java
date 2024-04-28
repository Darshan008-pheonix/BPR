package com.bpr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.bpr.entity.AdvanceCustomer;
import com.bpr.entity.BNPL;
import com.bpr.entity.BusinessParcel;
import com.bpr.service.BPRService;

@RestController  
public class BNPLController {
	@Autowired 
	BPRService s;
	
	@PostMapping("bnplEntry")
	ResponseEntity<BNPL> bnplEntry(@RequestBody BNPL b) {
		return new ResponseEntity<BNPL>(s.bnplEntry(b),HttpStatus.OK);
	}
	
	@PostMapping("advanceEntry")
	ResponseEntity<AdvanceCustomer> bnplEntry(@RequestBody AdvanceCustomer a) {
		return new ResponseEntity<AdvanceCustomer>(s.advanceEntry(a),HttpStatus.OK);
	}
	
	@PostMapping("businessEntry")
	ResponseEntity<BusinessParcel> bnplEntry(@RequestBody BusinessParcel b) {
		return new ResponseEntity<BusinessParcel>(s.businessEntry(b),HttpStatus.OK);
	}
	
	
	@GetMapping("bnplById")
	ResponseEntity<BNPL> bnplGetById(@RequestHeader int cid) {
		System.out.println("hhhh");
		return new ResponseEntity<BNPL>(s.findByIdBNPL(cid),HttpStatus.FOUND);
	}
	
	@GetMapping("advanceById")
	ResponseEntity<AdvanceCustomer> advanceGetById(@RequestHeader int cid) {
		return new ResponseEntity<AdvanceCustomer>(s.findByIdAdvance(cid),HttpStatus.FOUND);
	}
	
	@GetMapping("businessById")
	ResponseEntity<BusinessParcel> businessGetByID(@RequestHeader int cid) {
		return new ResponseEntity<BusinessParcel>(s.findByIdBP(cid),HttpStatus.FOUND);
	}
	
	@DeleteMapping("bnplById")
	ResponseEntity<BNPL> bnplDeleteById(@RequestHeader int cid) {
		System.out.println("hhhh");
		return new ResponseEntity<BNPL>(s.deleteByIdBNPL(cid),HttpStatus.FOUND);
	}
	
	@DeleteMapping("advanceById")
	ResponseEntity<AdvanceCustomer> advanceDeleteById(@RequestHeader int cid) {
		return new ResponseEntity<AdvanceCustomer>(s.deleteByIdAdvance(cid),HttpStatus.FOUND);
	}
	
	@DeleteMapping("businessById")
	ResponseEntity<BusinessParcel> businessDeleteById(@RequestHeader int cid) {
		return new ResponseEntity<BusinessParcel>(s.deleteByIdBP(cid),HttpStatus.FOUND);
	}

}
