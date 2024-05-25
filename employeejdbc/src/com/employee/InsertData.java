package com.employee;

import java.sql.*;

public class InsertData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		
		try {
			Connection conn = DriverManager.getConnection(dbURL,username,password);
			
			String sql = "INSERT INTO employee(emp_name,emp_address,emp_email) VALUES (?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"Rama");
			ps.setString(2, "ram123");
			ps.setString(3, "krishna@gmail.com");
			
			int rowInserted = ps.executeUpdate();
			ps.setString(1,"Sai");
			ps.setString(2, "sai123");
			ps.setString(3, "krishna@gmail.com");
			int rowInserted1 = ps.executeUpdate();
  		    if(rowInserted>0 && rowInserted1>0) {
				System.out.println("A new user was inserted successfully!");
			} else {
				System.out.println("Error , User is already present");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Using a Statement for a static SQL query. Using a PreparedStatement for a
	 * parameterized SQL query and using setXXX() methods to set values for the
	 * parameters. Using execute() method to execute general query. Using
	 * executeUpdate() method to execute INSERT, UPDATE or DELETE query Using
	 * executeQuery() method to execute SELECT query. Using a ResultSet to iterate
	 * over rows returned from a SELECT query, using its next() method to advance to
	 * next row in the result set, and using getXXX() methods to retrieve values of
	 * columns.
	 */
}
