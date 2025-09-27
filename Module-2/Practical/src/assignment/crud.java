package assesment;
import java.sql.*;

	public class crud {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
	        String user = "root"; 
	        String pass = "password"; 

	        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
	            System.out.println("Connected to database.");

	           
	            Statement stmt = conn.createStatement();

	          
	            stmt.executeUpdate("INSERT INTO users (id, name) VALUES (1, 'Alice')");
	         
	            stmt.executeUpdate("UPDATE users SET name='jay' WHERE id=1");
	          
	            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
	            }
	         
	            stmt.executeUpdate("DELETE FROM users WHERE id=1");

	         
	            String insert = "INSERT INTO users (id, name) VALUES (?, ?)";
	            PreparedStatement pstmtInsert = conn.prepareStatement(insert);
	            pstmtInsert.setInt(1, 2);
	            pstmtInsert.setString(2, "Charlie");
	            pstmtInsert.executeUpdate();

	            String update = "UPDATE users SET name=? WHERE id=?";
	            PreparedStatement pstmtUpdate = conn.prepareStatement(update);
	            pstmtUpdate.setString(1, "David");
	            pstmtUpdate.setInt(2, 2);
	            pstmtUpdate.executeUpdate();

	            String select = "SELECT * FROM users WHERE id=?";
	            PreparedStatement pstmtSelect = conn.prepareStatement(select);
	            pstmtSelect.setInt(1, 2);
	            ResultSet rs2 = pstmtSelect.executeQuery();
	            while (rs2.next()) {
	                System.out.println("ID: " + rs2.getInt("id") + ", Name: " + rs2.getString("name"));
	            }

	            String delete = "DELETE FROM users WHERE id=?";
	            PreparedStatement pstmtDelete = conn.prepareStatement(delete);
	            pstmtDelete.setInt(1, 2);
	            pstmtDelete.executeUpdate();

	            System.out.println("CRUD operations completed.");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

//	o Create a program that inserts, updates, selects, and deletes data using Statement. 
//	o Modify the program to use PreparedStatement for parameterized queries.