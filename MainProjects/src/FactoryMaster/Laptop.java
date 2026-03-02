package FactoryMaster;

public class Laptop {
	
	private static Laptop laptop = null;
	
	
	private Laptop()
	{
		
	}
	
	public static Laptop laptopFactory()//Lazy 
	{	
		if(laptop==null)
		{
			System.out.println("Creating a new Laptop object");
			laptop = new Laptop();
		}
		else
			System.out.println("Laptop object already present.");
		return laptop;
	}
	
}
