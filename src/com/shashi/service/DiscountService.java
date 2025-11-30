package com.shashi.service;

import com.shashi.beans.DiscountBean;

public interface DiscountService {
	
	public String calculateDiscount(String prodId, double prodDiscount, double prodPrice);

	public String updateProductPrice(String prodId, double discountPrice);
}
