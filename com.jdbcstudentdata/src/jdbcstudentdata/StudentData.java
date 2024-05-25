package jdbcstudentdata;

import java.sql.*;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost:3306/example";
		 String username = "root";
		 String password = "251004";
		 System.out.println(" 1. Inesrtion");
		 System.out.println("2. Updation");
		 System.out.println("3. Retrival");
		 System.out.println("4. Deletion");
		 System.out.println("enter your option");
		 
		 try(Scanner s = new Scanner("System.in")){
		 int i=s.nextInt(); 
		 switch (i) {
		 case 1:
			 try {
				 Connection conn = DriverManager.getConnection(dbURL, username, password);
				 String sql = "INSERT INTO student(st_name, st_age, st_address, st_email) VALUES(?,?,?,?)";
				 PreparedStatement ps=conn.prepareStatement(sql);
				 ps.setString(1, s.nextLine());
				 ps.setInt(2, s.nextInt());
				 ps.setString(3, s.nextLine());
				 ps.setString(4, s.nextLine());
				 int rowInserted = ps.executeUpdate();
				 if(rowInserted>0) {
					 System.out.println("A new user was inserted successfully!");
				 } else {
						System.out.println("Error , User is already present");
				 }
			 } catch(SQLException e) {
				 e.printStackTrace();
			 }
			 break;
		 case 2:
			 try {
				 Connection conn = DriverManager.getConnection(dbURL, username, password);
				 String sql = "UPDATE student SET st_age=?,st_address=?,st_email=? WHERE st_name=?";
				 PreparedStatement ps=conn.prepareStatement(sql);
				 ps.setInt(1, s.nextInt());
				 ps.setString(2, s.nextLine());
				 ps.setString(3, s.nextLine());
				 ps.setString(4, s.nextLine());
				 int rowUpdated = ps.executeUpdate();
				 if(rowUpdated > 0) {
					 System.out.println("An existing user was updated successfully!");
				 } else {
					 System.out.println("failed to update!");
				 }
			 } catch (SQLException e) {
				 e.printStackTrace();
			 }
			 break;
		 case 3:
			 try {
				 Connection conn = DriverManager.getConnection(dbURL, username, password);
				 String sql = "SELECT * FROM student";
				 Statement statement = conn.createStatement();
				 ResultSet  result = statement.executeQuery(sql);
				 int count = 0;
				 while(result.next()) {
					 String name = result.getString(2);
					 String pass = result.getString(3);
					 String st_name = result.getString("st_name");
					 String st_email =  result.getString("st_email");
					 
					 String output = "student #%d: %s - %d - %s - %s";
					 System.out.println(String.format(output, ++count, name, pass, st_name, st_email));
				 }
			 } catch(SQLException e) {
				 e.printStackTrace();
			 }
			 break;
		 case 4:
			 try {
				 Connection conn = DriverManager.getConnection(dbURL, username, password);
				 String sql = "DELETE FROM student WHERE st_name=?";
				 PreparedStatement ps = conn.prepareStatement(sql);
				 ps.setString(1, s.nextLine());
				 int rowDeleted = ps.executeUpdate();
				 if(rowDeleted>0) {
					 System.out.println("A user was deleted successfully!");
				 } else {
					 System.out.println("failed to delete!");
				 }
			 } catch (SQLException e) {
				 e.printStackTrace();
			 }
			 break;
		 default :
			 System.out.println("Invalid Option! please enter option between 1-4");
			 break;
		}
	}
}
}
