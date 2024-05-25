package com.employee;

import java.sql.*;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		try {
			Connection conn = DriverManager.getConnection(dbURL,username,password);
			
			String sql = "UPDATE employee SET emp_name=?,emp_address=?,emp_email=? WHERE employee_id=2";
			 
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "saikrishna");
			ps.setString(2, "hyderabad");
			ps.setString(3, "krishna@gmail.com");
			
			int rowsUpdate = ps.executeUpdate();
			if(rowsUpdate>0) {
				System.out.println("An existing user was updated successfully!");
			} else {
				System.out.println("Table is Empty");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
