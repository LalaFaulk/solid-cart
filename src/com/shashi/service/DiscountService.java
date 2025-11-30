package com.shashi.service;

import com.shashi.beans.DiscountBean;

public interface DiscountService {
	
	public String calculateDiscount(String prodId, double regPrice, double discountPrice);

	public String updateProductPrice(String prodId, double discountPrice);
}
