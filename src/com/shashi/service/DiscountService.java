package com.shashi.service;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public String addProduct(ProductBean discountedProduct);
	
	public String removeProduct(String prodId, double prodDiscount);
	
	public String calcDiscount(DiscountBean calculatedDiscount);
	
	public String updateProductPrice(ProductBean discountedProduct);
	
}
