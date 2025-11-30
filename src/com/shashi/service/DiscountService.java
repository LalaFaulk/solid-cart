package com.shashi.service;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public String addProduct(DiscountBean updatedProduct, ProductBean baseProduct);
	
	public String removeProduct(String prodId, DiscountBean regPrice);
	
	public double calcDiscount(String prodId, DiscountBean updatedProduct);
		
	public String updateProductPrice(DiscountBean updatedProduct);
	
}
