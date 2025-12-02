package com.shashi.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shashi.beans.DiscountBean;
import com.shashi.beans.ProductBean;

import com.shashi.service.DiscountService;
import com.shashi.utility.DBUtil;



public class DiscountServiceImpl implements DiscountService {
	
	@Override
	public String addProduct(ProductBean newProduct, String discountType) {
		String status = "Product Addition Failed!";
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("insert into discount values(?,?,?,?)");
			ps.setString(1, newProduct.getProdId());
			ps.setString(2, "None");
			ps.setDouble(3, 0.0);
			ps.setDouble(4, newProduct.getProdPrice());
			
			int k = ps.executeUpdate();
			
			if (k > 0) {
				status = "Product Added Successfully!";
								
				status = updateProductPrice(newProduct.getProdId(), discountType);
				
			} else {
				status = "Product Additon Failed!";
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
	public String updateProductPrice(String prodId, String discountType) {
		String status = "Failed to Update Product Price!";
				
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		
		try {
			
			ps = con.prepareStatement("update discount set type=? where prodid=?");
			ps.setString(1, discountType);
			ps.setString(2, prodId);
			
			int k = ps.executeUpdate();
			
			if (k > 0) {
				
				ps2 = con.prepareStatement("update product set pprice=(select(regprice - (regprice * percent)) from discount where prodid=?) where pid=?");
				ps2.setString(1, prodId);
				ps2.setString(2, prodId);
				
				ps2.executeUpdate();
				
				status = "Discount Added Successfully";
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
	public DiscountBean getProductDetails(String prodId) {
		DiscountBean discount = null;
		
		Connection con = DBUtil.provideConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			ps = con.prepareStatement("select * from discount where prodid=?");
			
			ps.setString(1, prodId);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				discount = new DiscountBean();
				discount.setProdId(rs.getString(1));
				discount.setDiscountType(rs.getString(2));
				discount.setDiscountPercent(rs.getDouble(3));
				discount.setRegularPrice(rs.getDouble(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBUtil.closeConnection(con);
		DBUtil.closeConnection(ps);
		
		return discount;
		
	}
	
}
