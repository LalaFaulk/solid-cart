package com.shashi.beans;

import java.io.Serializable;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private String discountType;
	private double discountPercent;
	private double regularPrice;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, String discountType, double discountPercent, double regularPrice) {
		super();
		this.prodId = prodId;
		this.discountType = discountType;
		this.discountPercent = discountPercent;
		this.regularPrice = regularPrice;
	}
	
	public String getProdId() {
		return prodId;
	}
	
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	
	public String getDiscountType() {
		return discountType;
	}
	
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}
	
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	public double getRegularPrice() {
		return regularPrice;
	}
	
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

}
