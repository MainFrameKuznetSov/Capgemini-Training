package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc 
{
	public static void main(String[] args) throws SQLException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/trialschema";
		String userName="root";
		String pWord="AdiMondal@2003";
		conn=DriverManager.getConnection(url,userName,pWord);
		PreparedStatement prep=null;
		prep=conn.prepareStatement("delete from Student where id=?");
		prep.setString(1,"12022002031089");
		prep.executeUpdate();
		ResultSet resSet=prep.executeQuery("Select * from Student");
		while(resSet.next())
			System.out.println("|   "+resSet.getString(1)+"  |"+
							   "    "+resSet.getString(2)+"  |");
	}
}
