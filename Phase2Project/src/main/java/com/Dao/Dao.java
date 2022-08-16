package com.Dao;


	import java.sql.Connection;
	import java.sql.DriverManager;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;

	import com.Service.*;


	public class Dao {
		public Connection con=null;
		public Statement st=null;

		public Dao() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","Bharath@1405");
			System.out.println("connection established with database");
			st=con.createStatement();
		}
	public List<String[]> getAvailableFlights(String f, String t, String d) {
			
			List<String[]> flights=new ArrayList<>();
			String query="SELECT * FROM flyaway.flights where fromm='"+f+"' and too='"+t+"' and datee='"+d+"'";
			try {
				ResultSet rs=st.executeQuery(query);
				
				if(rs.next()) {
					String[] flight=new String[3];
					flight[0]=rs.getString("name");
					flight[1]=rs.getString("timee");
					flight[2]=rs.getString("price");
					flights.add(flight);
					return flights;
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null;
		}

	public HashMap<String, String> checkUser(String email, String password) {
		
		HashMap<String,String> user=null;
		String query="select * from user where email='"+email+"' and password='"+password+"'";
		try {
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				user=new HashMap<>();
				user.put("name", rs.getString("name"));
				user.put("email",rs.getString("email"));
				user.put("phno",rs.getString("phno"));
				user.put("adno",rs.getString("adno"));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public boolean insertUser(HashMap<String, String> user) {

		String query="INSERT INTO user (email, password, name, phno, adno) values('"+user.get("email")+"','"+user.get("password")+"','"+user.get("name")+"','"+user.get("phno")+"','"+user.get("adno")+"')";                   
		
		try {
			st.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkAdmin(String email, String password) {
		
		try {
			ResultSet rs=st.executeQuery("select * from admin where email='"+email+"' and password='"+password+"'");
			if(rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean changeAdminPassword(String email, String password) {

		try {
			ResultSet rs=st.executeQuery("select * from admin where email='"+email+"'");
			if(!rs.next()) {
				return false;
			}
			st.execute("update admin set password='"+password+"' where email='"+email+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean insertFlight(HashMap<String, String> flight) throws SQLException {

		String query1 = "INSERT INTO flights (name, fromm, too, datee, timee, price) VALUES" + " ('"
				+ Service.fixSqlFieldValue(flight.get("name")) + "'," + " '" + Service.fixSqlFieldValue(flight.get("fromm")) + "'," + " '"
				+ Service.fixSqlFieldValue(flight.get("too")) + "'," + " '" + Service.fixSqlFieldValue(flight.get("datee")) + "'," + " '"
				+ Service.fixSqlFieldValue(flight.get("timee")) + "'," + " '" + Service.fixSqlFieldValue(flight.get("price")) + "')";
		
		try {
		
			st.executeUpdate(query1);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	}