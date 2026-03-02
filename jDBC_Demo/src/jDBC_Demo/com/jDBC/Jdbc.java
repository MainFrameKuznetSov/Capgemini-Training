package jDBC_Demo.com.jDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException
	{
		/*
		 * Step-1) Load Driver
		 * */
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		/*
		 * Step-2) Establish connection between Java file and database
		 * - getConnection(URL,UserName,PWord)
		 * - URL:- API:vendor//:<server-code>/<db-name>
		 * */
		String url="jdbc:mysql://localhost:3306/trialschema";
		String userName="root";
		String password="AdiMondal@2003";
		Connection conn=null;
		try 
		{
			conn=DriverManager.getConnection(url,userName,password);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Step-3) Creation of Statement object
		 * */
		Statement statement=null;
		try 
		{
			statement=conn.createStatement();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Creation of ResultSet object
		 * */
		
		ResultSet resultSet=null;
		try 
		{
			resultSet=statement.executeQuery("Select * from Student");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Printing records present in ResultSet object
		 * */
		
		try 
		{
			while(resultSet.next())
			{
				System.out.println(
						"|  "+resultSet.getString("Id")+"  |"+
						"  "+resultSet.getString(2)+"  |"+
						"  "+resultSet.getInt(3)+"  |"+
						"  "+resultSet.getInt(4)+"  |"+
						"  "+resultSet.getLong(5)+"  |"
						);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		/*
		 * INSERT record
		 * */
//		statement.executeUpdate("insert into Student values(\"12022002009149\",\"Kiring\",16,22,8791568212)");
		
		/*
		 * DELETE record
		 * */
//		statement.executeUpdate("delete from Student where id='12022002009149'");
		
		
		
	}
}
