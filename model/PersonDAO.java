package model;


import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PersonDAO {
   
   private String DB_URL = "jdbc:postgresql://localhost:5432/mydb?user=nata&password=nata;";
			   //"jdbc:postgresql://localhost:5432/mydb;user=nata;password=nata;";
	   
   
   public List<PersonBean> getFamily() throws SQLException{
	   
	    Connection conn = null;
		Statement statement = null;
		ResultSet set = null;
		List<PersonBean> family = new LinkedList<PersonBean>();
	   
		try {
			conn = DriverManager.getConnection(DB_URL);
			statement = conn.createStatement();
			String q = "SELECT * from Person;";
			//String q = "SELECT * from Person WHERE firstname = '" + fname + "' AND lastname = '" + lname + "';";
			set = statement.executeQuery(q);

			if (set.next()) {
				
				family.add(new PersonBean(set.getString("FIRSTNAME"), set.getString("LASTNAME"), set.getInt("MOTHER"), set.getInt("FATHER")));

			}
		} catch (SQLException e) {
			throw new SQLException("SQL Exception", e);
		} finally {
			if (set != null) set.close();
			if (statement != null) statement.close();
			if (conn != null) conn.close();
		}

		return family;

   }
   //need to modify to add dates afterwards (death + birth)
   public boolean addToFamily(String fname, String lname, int mother, int father) throws SQLException{
	  
	   Connection conn = null;
		Statement statement = null;
		ResultSet set = null;
		boolean added = false;
	   
		try {
			conn = DriverManager.getConnection(DB_URL);
			statement = conn.createStatement();
			String q = "INSERT INTO Persons (firstname, lastname, mother, father) VALUES('" + fname + "', '" + lname + "', " + mother + ", " + father + ");";
			statement.executeQuery(q);
			added = true;
		} catch (SQLException e) {
			throw new SQLException("SQL Exception", e);
		} finally {
			if (set != null) set.close();
			if (statement != null) statement.close();
			if (conn != null) conn.close();
		}

	   
	   return added;
   }

}
