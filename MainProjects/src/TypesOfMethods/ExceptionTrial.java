package TypesOfMethods;

import java.util.Arrays;
import java.util.List;

class InvalidAgeException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException()
	{
		super("Age is not valid for the service.");
	}
}

class Customer
{

	private String name;
	private int age;
	
	public Customer(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	@Override
	public String toString()
	{
		return "Name:- "+this.name+", Age:- "+this.age;
	}
	
}

public class ExceptionTrial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer>userList=Arrays.asList(new Customer("Aditya",22),new Customer("Ling",21),new Customer("Bheem",12),
											 new Customer("Ting Ding",18),new Customer("Penguin",17),new Customer("Lalu",72));
		for(Customer customer:userList)
		{
			String name=customer.getName();
			int age=customer.getAge();
			System.out.println(customer);
			try 
			{
				if(age<18)
					throw new InvalidAgeException();
			}
			catch(InvalidAgeException ex)
			{
				System.out.println(ex.getMessage());
			}
//			System.out.println();
		}
	}

}
