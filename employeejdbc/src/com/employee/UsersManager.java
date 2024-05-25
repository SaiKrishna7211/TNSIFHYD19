package com.employee;

import java.sql.*;

public class UsersManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		
		try {
			Connection conn = DriverManager.getConnection(dbURL,username,password);
			
			if(conn!= null) {
				System.out.println("Connected to the database");
				conn.close();
			} else {
				System.out.println("failed to connect!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
