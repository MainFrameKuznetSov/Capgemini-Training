package StringPrograms;

import java.util.Scanner;

/*
 * ---------------------------------------
 * |                                     |
 * |  ------------------------------     |
 * |  |                            |     |
 * |  |                            |     |
 * |  | String Constant Pool       |     |
 * |  |                            |     |
 * |  |   (0xa9)name1<----name2    |     |              Line 30 and 31
 * |  ------------------------------     |
 * |                                     |
 * |                                     |
 * |                                     |
 * |             Heap Area               |
 * |                                     |
 * |                                     |
 * ---------------------------------------	
 * */

public class StringBasicProgs 
{
	
	public static void main(String[] args) 
	{
		
		String name1="Aditya";
		String name2="Aditya";
		String name3 = new String("Aditya");
//		name3="Aditya"; ---> New type of initialisation re-allocates it to String Constant Pool leading to a dereference here and 
//							 thus calls in the Garbage Collector to pick the prev object and the new one creates a reference to 
//							 the original memory locations
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		//All are same as the hash function is input(formal parameter) based and same inputs will give same outputs
		
		System.out.println();
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		
		name3="Aditya";
		System.out.println(System.identityHashCode(name3));
		//
		
//		Scanner userInput=new Scanner(System.in);
//		System.out.println(userInput);
		
		System.out.println();
		if(name1==name2)
			System.out.println("Same address");
		else
			System.out.println("Not same");
		
		if(name1==name3)
			System.out.println("Same address");
		else
			System.out.println("Not same");		
		
	}
	
}
