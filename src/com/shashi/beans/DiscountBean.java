package com.shashi.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private String transactionId;
	private double prodDiscount;
	private Timestamp orderDate;
	private double regPrice;
	private double discountPrice;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, String transactionId, double prodDiscount, Timestamp orderDate, double regPrice, double discountPrice) {
		super();
		this.prodId = prodId;
		this.transactionId = transactionId;
		this.prodDiscount = prodDiscount;
		this.orderDate = orderDate;
		this.regPrice = regPrice;
		this.discountPrice = discountPrice;
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
	
	public double getRegPrice() {
		return regPrice;
	}
	
	public void setRegPrice(double regPrice) {
		this.regPrice = regPrice;
	}
	
	public double getDiscountPrice() {
		return discountPrice;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

}
