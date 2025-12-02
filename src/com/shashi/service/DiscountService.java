package com.shashi.service;

import java.util.List;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

public interface DiscountService {
	
	public String updateProductPrice(String prodId, String discountType);
	
	public DiscountBean getProductDetails(String prodId);
			
}
