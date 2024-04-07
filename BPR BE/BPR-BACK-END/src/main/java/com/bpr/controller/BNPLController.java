package com.bpr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.bpr.entity.BNPL;
import com.bpr.service.BNPLService;

@RestController  
public class BNPLController {
	@Autowired 
	BNPLService s;
	
	@PostMapping("entry")
	ResponseEntity<BNPL> bnplEntry(@RequestBody BNPL b) {
		return new ResponseEntity<BNPL>(s.bnplEntry(b),HttpStatus.OK);
	}

}
