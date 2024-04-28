package com.bpr.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvanceCustomer {

	private int slno;
	@Id
	private int cid;
	@Column(nullable = false,unique = true)
	private int contId;
	@Column(nullable = false)
	private String custName;
	@Column(nullable = false)
	private int invNum;
	@Min(value = 0)
	@Column(nullable = false)
	private int noOfArt;
	@Min(value = 0)
	@Column(nullable = false)
	private double speedRev;
	@Min(value = 0)
	private double disAmt;
	@Min(value = 0)
	@Column(nullable = false)
	private double netAmt;
	@Min(value = 0)
	@Column(nullable = false)
	private double cgst;
	@Min(value = 0)
	@Column(nullable = false)
	private double sgst;
	@Min(value = 0)
	private double penalInt;
	@Min(value = 0)
	@Column(nullable = false)
	private double grossAmt;
	private Date date;
}
