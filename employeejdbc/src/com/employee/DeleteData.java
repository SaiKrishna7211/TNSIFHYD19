package com.employee;

import java.sql.*;

public class DeleteData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)){
			String sql = "DELETE FROM employee WHERE emp_name=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Rama");
			
			int rowsDeleted = ps.executeUpdate();
			if(rowsDeleted>0) {
				System.out.println("A user was deleted successfully!");
			}else {
				System.out.println("User is not present in Table!");
			}
		} catch( SQLException e) {
			e.printStackTrace();
		}
	}
}
