package com.shashi.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shashi.service.DiscountService;
import com.shashi.utility.DBUtil;



public class DiscountServiceImpl implements DiscountService {

	@Override
	public String updateProductPrice(String prodId, String discountType) {
		String status = "Product Addition Failed!";
				
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
	
}
