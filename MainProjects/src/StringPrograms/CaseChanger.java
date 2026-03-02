package StringPrograms;

import java.util.Scanner;

public class CaseChanger 
{

	public static StringBuilder getCaseChangedString(String param)
	{
		int len=param.length();
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<len;++i)
		{
			char curr=param.charAt(i);
			if(curr>='A' && curr<='Z')
				ans.append((char)(curr+32));
			else if(curr>='a' && curr<='z')
				ans.append((char)(curr-32));
			else
				ans.append(curr);
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter token:- ");
		String input=userInput.nextLine();
		System.out.println(getCaseChangedString(input));
		
	}
	
}
