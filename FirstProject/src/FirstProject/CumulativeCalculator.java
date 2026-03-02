package FirstProject;

import java.util.Scanner;

public class CumulativeCalculator 
{
	
	static Scanner userInput = new Scanner(System.in);
	
//	public 
	static String mainSum="";
	
	public static boolean isANumber(String param)
	{
		for(int i=0;i<param.length();++i)
		{
			if(param.charAt(i)<'0' || param.charAt(i)>'9')
				return false;
		}
		return true;
	}
	
	public static void solveSum(String param)
	{
		double sum=0.0d;
		String tempVal="";
		for(int i=0;i<param.length();++i)
		{
			if(param.charAt(i)=='$')
			{
				System.out.println(tempVal);
				sum+=Double.parseDouble(tempVal);
				tempVal="";
			}
			else
				tempVal+=param.charAt(i);
		}
		System.out.println("Sum:- "+sum);
	}
	
	public static void main(String args[])
	{
//		double
		while(true)
		{
			System.out.println("Enter token:- ");
			String tkn = userInput.next();
			userInput.nextLine();
			if(tkn.equals("="))
			{
				solveSum(mainSum);
				break;
			}
			else if(isANumber(tkn))
			{
				mainSum+=tkn;
				mainSum+="$";
				System.out.println(mainSum);
			}
			else
				System.out.println("Invalid input.");
		}
	}
}
