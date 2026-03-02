package jDBC_Trial3.com.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Data
{

	private String id;
	private String name;
	private int grade;
	private int age;
	private long mobno;
	
	public Data(String id, String name, int grade, int age, long mobno) 
	{
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.mobno = mobno;
	}

	public String getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getGrade() 
	{
		return grade;
	}

	public int getAge() 
	{
		return age;
	}

	public long getMobno() 
	{
		return mobno;
	}	
	
}

public class DynamicDbTrial {


	static Scanner userInput=new Scanner(System.in);
	static Connection conn=null;
	static PreparedStatement prep=null;
	
	public static void dataOperator(int flag) throws SQLException
	{
		System.out.println("Enter the no. of records demanded:- ");
		int numRecords=userInput.nextInt();
		userInput.nextLine();
		Data data[]=new Data[numRecords];
		for(int i=0;i<numRecords;++i)
		{
			System.out.println("Enter ID:- ");
			String id=userInput.nextLine();
			System.out.println("Enter name:- ");
			String name=userInput.nextLine();
			System.out.println("Enter standard:- ");
			int grade=userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter age:- ");
			int age=userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter mobile no:- ");
			long mobno=userInput.nextLong();
			userInput.nextLine();
			data[i]=new Data(id,name,grade,age,mobno);
			if(flag==1)
				prep=conn.prepareStatement("insert into Student values(?,?,?,?,?)");
			else
				prep=conn.prepareStatement("delete from Student where id=?");
			prep.setString(1,data[i].getId());
			if(flag==1)
			{
				prep.setString(2,data[i].getName());
				prep.setInt(3,data[i].getGrade());
				prep.setInt(4,data[i].getAge());
				prep.setLong(5,data[i].getMobno());
			}
			prep.executeUpdate();
			if(flag==1)
			{
				System.out.println("Data(s) inserted.");
				System.out.println();
			}
			else
			{
				System.out.println("Data(s) deleted.");
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner userInput=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/trialschema";
		String userName="root";
		String pWord="AdiMondal@2003";
		conn=DriverManager.getConnection(url,userName,pWord);
		System.out.println("1) Insert Data");
		System.out.println("2) Delete by ID");
		System.out.println("Enter you choice:- ");
		int choice=userInput.nextInt();
		userInput.nextLine();
		dataOperator(choice);
		ResultSet resultSet=prep.executeQuery("Select * from Student");
		while(resultSet.next())
			System.out.println("|  "+resultSet.getString(1)+"  |"+
					           "   "+resultSet.getString(2)+"  |"+
					           "   "+resultSet.getInt(3)+"  |"+
					           "   "+resultSet.getInt(4)+"  |"+
					           "   "+resultSet.getLong(5)+"  |");
		userInput.close();
	}

}
