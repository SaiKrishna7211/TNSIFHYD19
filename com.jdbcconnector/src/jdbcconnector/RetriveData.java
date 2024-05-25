package jdbcconnector;

import java.sql.*;

public class RetriveData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "251004";
		
		try(Connection conn= DriverManager.getConnection(dbURL,username,password)) {
			String sql = "SELECT * FROM users";
			
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(sql);
			
			int count=0;
			
			while(result.next()) {
				String name = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString("full_name");
				String email = result.getString("email");
				
				String output = "user #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
