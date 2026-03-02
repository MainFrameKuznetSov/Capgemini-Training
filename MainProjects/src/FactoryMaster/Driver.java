package FactoryMaster;

public class Driver 
{

	public static void main(String[] args) 
	{
//		Laptop lap1 = new Laptop();
//		Laptop lap2 = new Laptop();
//		System.out.println(lap1);
//		System.out.println(lap2);
		Laptop lap3 = Laptop.laptopFactory();
		System.out.println(lap3);
		Laptop lap4 = Laptop.laptopFactory();
		System.out.println(lap4);	
		
	}
	
}
