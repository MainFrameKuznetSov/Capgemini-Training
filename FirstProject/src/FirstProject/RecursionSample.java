package FirstProject;

public class RecursionSample
{
	
	static int superThala=staticMethod();
	int thala=nonStaticMethod();
	
	static 
	{
		System.out.println("Inside static block.");
	}
	
	{
		System.out.println("Inside non-static block.");
	}
	
	public RecursionSample()
	{
		System.out.println("Inside constructor");
	}
	
	public static int staticMethod()
	{
		System.out.println("Inside static method");
		return -1;
	}
	
	public int nonStaticMethod()
	{
		System.out.println("Inside non static method");
		return 1;
	}
	
	public static void main(String args[])
	{
		System.out.println("Start of main()");
		RecursionSample rec=new RecursionSample();
//		System.out.println(rec);
		System.out.println("End of main()");
	}
	
	/*
	 * Initialized superThala
	 * Inside static block
	 * 
	 * For every Object Creation(step by step)
	 * 	1) Load the class
	 * 	2) Control proceeds from all non-static blocks(methods excluded) from top to bottom
	 * 
	 * Inside non-static block (Happened due to constructor)??
	 * Inside Constructor
	 * Start of main()
	 * 
	 * */
	
}
