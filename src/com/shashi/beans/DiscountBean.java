package com.shashi.beans;

import java.io.Serializable;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private double prodDiscount;
	private double regPrice;
	private double salePrice;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, double prodDiscount, double regPrice, double salePrice) {
		super();
		this.prodId = prodId;
		this.prodDiscount = prodDiscount;
		this.regPrice = regPrice;
		this.salePrice = salePrice;
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
		return salePrice;
	}
	
	public void setDiscountPrice(double salePrice) {
		this.salePrice = salePrice;
	}

}
