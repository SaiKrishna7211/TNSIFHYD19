package jdbconnectorsample;

import java.sql.*;

public class Users {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String user = "root";
		String password = "251004@ss";
		
		try {
			Connection conn = DriverManager.getConnection(dbURL,user,password);
			if(conn!=null) {
				System.out.println("Connected to the database");
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
