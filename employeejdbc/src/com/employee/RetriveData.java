package com.employee;

import java.sql.*;

public class RetriveData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		
		try(Connection conn= DriverManager.getConnection(dbURL,username,password)) {
			String sql = "SELECT * FROM employee";
			
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			int count=0;
			
			while(result.next()) {
				String name = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString("emp_name");
				String email = result.getString("emp_email");
				
				String output = "user #%d: %s - %s - %s";
				System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
