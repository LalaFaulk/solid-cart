package com.shashi.service;

import java.util.List;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public String addProduct(ProductBean newProduct, String discountType);
	
	public String updateProductPrice(String prodId, String discountType);
	
	public DiscountBean getProductDetails(String prodId);
	
	public double getRegularPrice(String prodId);
			
}
