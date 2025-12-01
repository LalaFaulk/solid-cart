package com.shashi.service;

import java.util.List;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
		
	public String addProduct(ProductBean product, double prodDiscount);
	
	public String removeProduct(String prodId);
	
	public String updateProduct(ProductBean updatedProduct);
	
}
