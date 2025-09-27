package assesment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
	        String user = "root";  
	        String pass = "password"; 

	        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
	            System.out.println("Connected to the database successfully!");
	        } catch (SQLException e) {
	            System.out.println("Failed to connect to the database.");
	            e.printStackTrace();
	        }
	    }
	}

//Write a Java program to establish a connection to a database and print a
//confirmation message upon successful connection.
