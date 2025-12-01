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

	public String addProduct(ProductBean product, double prodDiscount) {
		String status = "Product Addition Failed!";
		
		double salePrice = product.getProdPrice() - (product.getProdPrice() * prodDiscount);
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		
		try {
			
			ps = con.prepareStatement("insert into discount values(?,?,?,?)");
			ps.setString(1, product.getProdId());
			ps.setDouble(2, prodDiscount);
			ps.setDouble(3, product.getProdPrice());
			ps.setDouble(4, salePrice);
			
		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);

		return status;
	}
	
	public String removeProduct(String prodId) {
		String status = "Product Removal Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		
		try {
			ps = con.prepareStatement("update product join discount on product.pid=discount.prodid set product.pprice=discount.regprice where pid=?");
			ps.setString(1, prodId);
			
			int i = ps.executeUpdate();
			
			if (i > 0) {
				ps2 = con.prepareStatement("delete from discount where prodid=?");
				
				ps2.setString(1, prodId);
				
				ps2.executeUpdate();
				
				status = "Product Removed Successfully!";
			}
			
		}catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}

		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		DBUtil.closeConnection(ps2);

		return status;
		
	}
	
	public String updateProduct(ProductBean updatedProduct) {
		String status = "Product Updation Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		
		try {
			
			ps = con.prepareStatement("update product join discount on product.pid=discount.prodid set product.pprice=discount.saleprice where pid=?");
			
			ps.setString(1, updatedProduct.getProdId());
			
			int i = ps.executeUpdate();
			
			if (i > 0) 
				status = "Product Updated Successfully";
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		
		return status;
		
	}
	
}
