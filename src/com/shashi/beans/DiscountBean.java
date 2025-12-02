package com.shashi.beans;

import java.io.Serializable;

public class DiscountBean implements Serializable {
	
	private String prodId;
	private String discountType;
	private double discountPercent;
	
	public DiscountBean() {
	}
	
	public DiscountBean(String prodId, String discountType, double discountPercent) {
		super();
		this.prodId = prodId;
		this.discountType = discountType;
		this.discountPercent = discountPercent;
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

}
