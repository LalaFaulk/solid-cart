package com.shashi.service;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public String addProduct(DiscountBean discountedProduct);
	
	public String removeProduct(String prodId, double regPrice);
	
	public String calcDiscount(String prodId, double regPrice);
	
	public String updateProductPrice(String prodId, double currentPrice);
	
}
