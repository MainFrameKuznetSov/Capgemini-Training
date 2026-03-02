package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialschema";
		String username="root";
		String password="AdiMondal@2003";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url,  username, password);
			
			PreparedStatement prep=null;
			prep=conn.prepareStatement("delete from Student where id=?");
			prep.setString(1,"12022002031089");
			prep.executeUpdate();
			ResultSet resSet=prep.executeQuery("Select * from Student");
			while(resSet.next())
				System.out.println("|   "+resSet.getString(1)+"  |"+
								   "    "+resSet.getString(2)+"  |");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
