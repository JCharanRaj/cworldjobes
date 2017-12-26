package task;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class a {
	public static void main(String[] args) {
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	      final String DB_URL="jdbc:mysql://localhost/TEST";

	      //  Database credentials
	       final String USER = "root";
	       final String PASS = "password";

	      // Set response content type
	     
	       Statement stmt=null;
	       Connection conn=null;
	      try {
	         // Register JDBC driver
	         Class.forName("com.mysql.jdbc.Driver");

	         // Open a connection
	         conn = DriverManager.getConnection(DB_URL, USER, PASS);

	         // Execute SQL query
	          stmt = conn.createStatement();
	         String sql;
	         sql = "SELECT id, first, last, age FROM Employees";
	         ResultSet rs = stmt.executeQuery(sql);

	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	            int id  = rs.getInt("id");
	            int age = rs.getInt("age");
	            String first = rs.getString("first");
	            String last = rs.getString("last");

	            //Display values
	            System.out.println("ID: " + id + "<br>");
	            System.out.println(", Age: " + age + "<br>");
	            System.out.println(", First: " + first + "<br>");
	            System.out.println(", Last: " + last + "<br>");
	         }
	         System.out.println("added");

	         // Clean-up environment
	         rs.close();
	         stmt.close();
	         conn.close();
	      } catch(SQLException se) {
	         //Handle errors for JDBC
	         se.printStackTrace();
	      } catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      } 
	      finally {
	         //finally block used to close resources
	         try {
	            if(stmt!=null)
	               stmt.close();
	         } catch(SQLException se2) {
	         } // nothing we can do
	         try {
	            if(conn!=null)
	            conn.close();
	         } catch(SQLException se) {
	            se.printStackTrace();
	         } //end finally try
	      }
	}

}
