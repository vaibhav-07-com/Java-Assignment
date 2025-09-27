package assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection createConnection() throws SQLException {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        System.out.println("JDBC Driver not found!");
	        return null;
	    }
	    String url = "jdbc:mysql://localhost:3306/training_institute";
	    String user = "root";
	    String password = "";
	    return DriverManager.getConnection(url, user, password);
	    
	}
}

//o Write a simple Java program to connect to a MySQL database using JDBC. 
//o Demonstrate the process of loading a JDBC driver and establishing a connection.





