package StringPrograms;

import java.util.Scanner;

public class StringTrimmer 
{
	
	public static boolean isPalindrome(String param)
	{
		int left=0,right=param.length()-1;
		while(left++<right--)
		{
			if(param.charAt(left)!=param.charAt(right))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter token:- ");
		String input=userInput.nextLine();
		if(isPalindrome(input))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		System.out.println("Using trim() :- "+input.trim());
		System.out.println("Orginal string:- "+input);
		int indexPtr=0;
		try 
		{
			while(input.charAt(indexPtr++)==' ')
			{}
		}
		catch(Exception ex)
		{
			System.out.println("Null String not allowed.");
		}
//		System.out.println("Without trim() :- "+input.substring(indexPtr-1));
		StringBuilder result=new StringBuilder();
		for(int i=indexPtr-1;i<input.length();++i)
			result.append(input.charAt(i));
		System.out.println("Without trim() :- "+result);
	}	
}
