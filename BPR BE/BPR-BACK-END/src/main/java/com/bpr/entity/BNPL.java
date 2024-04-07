package com.bpr.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;




@Entity
public class BNPL {
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Min(value = 0)
	@Column(nullable = false)
	private double grossAmt;
	
	private Date date;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getContId() {
		return contId;
	}
	public void setContId(int contId) {
		this.contId = contId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getInvNum() {
		return invNum;
	}
	public void setInvNum(int invNum) {
		this.invNum = invNum;
	}
	public int getNoOfArt() {
		return noOfArt;
	}
	public void setNoOfArt(int noOfArt) {
		this.noOfArt = noOfArt;
	}
	public double getSpeedRev() {
		return speedRev;
	}
	public void setSpeedRev(double speedRev) {
		this.speedRev = speedRev;
	}
	public double getDisAmt() {
		return disAmt;
	}
	public void setDisAmt(double disAmt) {
		this.disAmt = disAmt;
	}
	public double getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(double netAmt) {
		this.netAmt = netAmt;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getPenalInt() {
		return penalInt;
	}
	public void setPenalInt(double penalInt) {
		this.penalInt = penalInt;
	}
	public double getGrossAmt() {
		return grossAmt;
	}
	public void setGrossAmt(double grossAmt) {
		this.grossAmt = grossAmt;
	}
	
	
	

	
	
}
