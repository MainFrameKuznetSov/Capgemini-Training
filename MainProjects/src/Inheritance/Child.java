package Inheritance;

public class Child extends Parent 
{
	String name="SMALL";
	
	public static void main(String[] args) 
	{
		Child child = new Child();
		Parent parent = child;//Parent parent = new Child();
		System.out.println(child.name);
		System.out.println(child.namePar);
	}
	
}
