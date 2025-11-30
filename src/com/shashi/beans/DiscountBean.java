package com.shashi.beans;

import java.io.Serializable;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private double prodDiscount;
	private double regPrice;
	private double discountPrice;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, double prodDiscount, double regPrice, double discountPrice) {
		super();
		this.prodId = prodId;
		this.prodDiscount = prodDiscount;
		this.regPrice = regPrice;
		this.discountPrice = discountPrice;
	}
	
	public String getProdId() {
		return prodId;
	}
	
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	
	public double getProdDiscount() {
		return prodDiscount;
	}
	
	public void setProdDiscount(double prodDiscount) {
		this.prodDiscount = prodDiscount;
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
