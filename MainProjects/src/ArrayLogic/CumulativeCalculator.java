package ArrayLogic;

import java.util.Scanner;

public class CumulativeCalculator 
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static boolean isANumber(String param)
	{
		for(int i=0;i<param.length();++i)
		{
			if(param.charAt(i)<'0' && param.charAt(i)>'9' && param.charAt(i)!='.')
				return false;
		}
		return true;
	}
	
	public static void solveSum(double... param)
	{
		double sum=0.0d;
		for(int i=0;i<param.length;++i)
			sum+=param[i];
		System.out.println("Sum:- "+sum);
	}
	
	public static void main(String args[])
	{
//		double
		double operands[]=new double[2000];
		int arrayInd=0;
		while(true)
		{
			System.out.println("Enter token:- ");
			String tkn = userInput.next();
			userInput.nextLine();
			if(tkn.equals("="))
			{
				solveSum(operands);
				break;
			}
			else if(isANumber(tkn))
				operands[arrayInd++]=Double.valueOf(tkn);
			else
				System.out.println("Invalid input.");
		}
		userInput.close();
	}
}
