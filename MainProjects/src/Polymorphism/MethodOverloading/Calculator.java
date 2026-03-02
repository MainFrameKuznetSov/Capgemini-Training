package Polymorphism.MethodOverloading;

public class Calculator 
{
	
	public static void addition(int a,int b)
	{
		System.out.println("Sum:- "+(a+b));
	}
	
	public void nsAddition(int a,int b)
	{
		System.out.println("Sum:- "+(a+b));
	}
	
	public void nsAddition(double a,double b)
	{
		System.out.println("Sum:- "+(a+b));
	}
	
	public static void main(String[] args) {
		addition(12,13);
		new Calculator().nsAddition(90, 11);
	}
	
}
