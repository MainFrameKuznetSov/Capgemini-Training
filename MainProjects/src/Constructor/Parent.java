package Constructor;

public class Parent 
{
	
	public int x;
	
	/*
	 * Note:- In case a parameterized constructor is present, the default constructor is not created implicitly.
	 * 
	 * 
	 * 
	 * */
	
	public Parent()
	{
		this.x=1;
	}
	
	public Parent(int x)
	{
		this.x=x;
	}
	
}
