package com.shashi.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;
import com.shashi.service.DiscountService;
import com.shashi.service.ProductService;
import com.shashi.utility.DBUtil;
import com.shashi.utility.IDUtil;
import com.shashi.utility.MailMessage;


public class DiscountServiceImpl implements DiscountService {
	
	@Override
	public String addProduct(DiscountBean updatedProduct, ProductBean baseProduct) {
		String status = "Product Addition Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;		

		try {
			
			ps = con.prepareStatement("insert into discount values(?,?,?,?)");
			
			ps.setString(1, baseProduct.getProdId());
			ps.setDouble(2, updatedProduct.getProdDiscount());
			ps.setDouble(3, baseProduct.getProdPrice());
			ps.setDouble(4, updatedProduct.getDiscountPrice());
			
			int i = ps.executeUpdate();
			
			if (i > 0) {
				
				status = "Product Added Successfully!";
			}

		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		
		return status;
		
	}
	
	@Override
	public String removeProduct(String prodId, DiscountBean regPrice) {
		String status = "Product Removal Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		
		try {
			ps = con.prepareStatement("delete from discount where pid=?");
			ps.setString(1,  prodId);
			
			int i = ps.executeUpdate();
			
			if (i > 0) {
				status = "Product Removed Successfully!";
				
				ps2 = con.prepareStatement("update product set pprice=? where pid=?");
				
				ps2.setDouble(1, regPrice.getRegPrice());
				ps2.setString(2, prodId);
				
			}
			
		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		
		return status;
	}
	
	@Override
	public double setDiscount(String prodId, DiscountBean updatedProduct) {
		double currentPrice = updatedProduct.getRegPrice();
		double discountPrice = currentPrice - (currentPrice * updatedProduct.getProdDiscount());
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		
		try {
			
			ps = con.prepareStatement("update discount set discountprice=? where prodid=?");
			
			ps.setDouble(1, discountPrice);
			ps.setString(2, prodId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return discountPrice;
		
	}
	
	@Override
	public String updateProductPrice(DiscountBean updatedProduct) {
		String status = "Price Updation Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("update product set pprice=? where pid=?");
			
			ps.setDouble(1, updatedProduct.getDiscountPrice());
			ps.setString(2, updatedProduct.getProdId());
			
			int k = ps.executeUpdate();
			
			if (k > 0) {
				status = "Price Updated Successfully!";
			}
		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		
		return status;
		
	}

}
