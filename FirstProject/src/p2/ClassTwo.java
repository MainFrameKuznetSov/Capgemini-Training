package p2;

import p1.ClassOne;

public class ClassTwo {
	public static void main(String args[])
	{
		System.out.println("Start Kiring");
		varArgs(1,3,2,4,9);
		System.out.println("End Kiring");
	}
	
	public static void varArgs(double ...d)
	{
		for(double i:d)
			System.out.println(i);
	}
	
}
