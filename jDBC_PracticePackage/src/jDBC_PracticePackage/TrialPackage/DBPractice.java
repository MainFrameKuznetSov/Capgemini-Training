package jDBC_PracticePackage.TrialPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPractice 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		/*
		 * Load Driver
		 * 
		 * */
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*
		 *  Connection establishment
		*/
		String url="jdbc:mysql://localhost:3306/trialschema";
		String userName="root";
		String passwrd="AdiMondal@2003";
		Connection conn=null;
		conn=DriverManager.getConnection(url,userName,passwrd);
		
		/*
		 * Statement
		*/
		
		Statement statement=null;
		statement=conn.createStatement();
		
		/*
		 * ResultSet
		*/
		
		ResultSet resultSet=null;
		resultSet=statement.executeQuery("Select * from Student");
		while(resultSet.next())
		{
			System.out.println("|  "+resultSet.getString(1)+"  |"
					+ "  "+resultSet.getString(2)+"  |"
					+ "  "+resultSet.getInt(3)+"  |"
					+ "  "+resultSet.getInt(4)+"  |"
					+ "  "+resultSet.getLong(5)+"  |"
					);
		}
		
	}

}
