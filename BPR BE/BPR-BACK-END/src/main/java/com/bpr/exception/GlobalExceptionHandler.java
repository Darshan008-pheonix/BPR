package com.bpr.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	ResponseEntity SQLIntegrityConstraintViolationExceptionHandler(SQLIntegrityConstraintViolationException e) {
		return new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity IdNotFoundExceptionHandler() {
		return new ResponseEntity("Id Not Found...!!!",HttpStatus.NOT_FOUND);
	}
}
