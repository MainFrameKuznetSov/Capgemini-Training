package ArrayLogic;

import java.util.Scanner;

public class ArrayInput 
{

	public static boolean isNumber(String param)
	{
		for(int i=0;i<param.length();++i)
		{
			char c=param.charAt(i);
			if(c<'0' || c>'9')
				return false;
		}
		return true;
	}
	
	public static boolean isDecimalNumber(String param)
	{
		for(int i=0;i<param.length();++i)
		{
			char c=param.charAt(i);
			if(c=='.')
				return true;
		}
		return false;
	}
	
	public static boolean isBoolean(String param)
	{
		if(param.equals("true") || param.equals("false"))
			return true;
		return false;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Object inputNumbers[] =new Object[5];
		Scanner userInput=new Scanner(System.in); 
		for(int i=0;i<inputNumbers.length;++i)
		{
			System.out.println("Enter token:- ");
			String tkn=userInput.nextLine();
//			userInput.nextLine();
			if(tkn.length()==1)
				inputNumbers[i]=(char)tkn.charAt(0);
			else
			{
				if(isNumber(tkn))
					inputNumbers[i]=Long.valueOf(tkn);
				else if(isDecimalNumber(tkn))
					inputNumbers[i]=Double.valueOf(tkn);
				else if(isBoolean(tkn))
					inputNumbers[i]=Boolean.valueOf(tkn);
				else
					inputNumbers[i]=tkn;
			}
		}
		for(int i=0;i<inputNumbers.length;++i)
			System.out.println(inputNumbers[i]);
	}

}
