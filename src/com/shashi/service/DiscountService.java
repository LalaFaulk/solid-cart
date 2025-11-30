package com.shashi.service;

import com.shashi.beans.DiscountBean;

public interface DiscountService {
	
	public String calculateDiscount(String prodId, double prodDiscount, double regPrice);

	public String addProduct(String prodId);
	
	public String removeProduct(String prodId);
	
	public String updateProductPrice(String prodId, double discountPrice);
	
}
