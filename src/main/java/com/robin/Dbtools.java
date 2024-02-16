package com.robin;
import java.sql.*;

public class Dbtools {
	
	public static boolean auth(String username) throws SQLException{
		
		try {
		String sql = "select * from actor;";
		String url = "jdbc:mysql://localhost:3306/sakila";
		String dbusername = "root";
		String passwd = "mysqlroot";
	
		
		Connection con = DriverManager.getConnection(url,dbusername,passwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		while(rs.next()) {
			if(rs.getString(2).equals(username)) {
				System.out.println(username);
				return true;
			}
	
		}
		
		System.out.println("User not found");
		return false;
		
		}catch(SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return false;
	}
}
