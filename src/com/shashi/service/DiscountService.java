package com.shashi.service;

import java.util.List;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public boolean computeDiscount(String prodId, double prodDiscount, double regPrice);
	
	public String addProduct(DiscountBean discountProduct);
	
	public String removeProduct(String prodId);
	
	public String updateProduct(ProductBean updatedProduct);
	
}
