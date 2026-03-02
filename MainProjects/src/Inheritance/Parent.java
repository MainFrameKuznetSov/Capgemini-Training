package Inheritance;

public class Parent 
{
	
	String namePar="BIG";
	
	public static void main(String[] args) {
		Parent parent = new Parent();
//		System.out.println(parent.name); The parent cannot inherit the data members of child but the opposite is true.
		System.out.println(parent.namePar);
	}
	
}
