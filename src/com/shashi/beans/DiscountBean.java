package com.shashi.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private String transactionId;
	private double prodDiscount;
	private Timestamp orderDate;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, String transactionId, double prodDiscount, Timestamp orderDate) {
		super();
		this.prodId = prodId;
		this.transactionId = transactionId;
		this.prodDiscount = prodDiscount;
		this.orderDate = orderDate;
	}
	
	public String getProdId() {
		return prodId;
	}
	
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public double getProdDiscount() {
		return prodDiscount;
	}
	
	public void setProdDiscount(double prodDiscount) {
		this.prodDiscount = prodDiscount;
	}
	
	public Timestamp getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

}
