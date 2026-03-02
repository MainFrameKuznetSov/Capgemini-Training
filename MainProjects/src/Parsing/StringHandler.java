package Parsing;

public class StringHandler 
{
	
	public static boolean isNumber(char param)
	{
		return (param>='0' && param<='9');
	}
	
	public static void main(String[] args) 
	{
		String input="qwer9ty";
		try
		{
			int equiNumber=Integer.parseInt(input);
			System.out.println("Number:- "+equiNumber);
		}
		catch(Exception exc)
		{
			int ind=0,res_num=0;
			while(ind<input.length() && !isNumber(input.charAt(ind)))
				++ind;
			boolean alreadyDone=false;
			if(ind>=input.length())
			{
				System.out.println("Not a valid integer");
				return ;
			}
			for(int i=ind;i<input.length();++i)
			{
				char ch=input.charAt(i);
				if(!isNumber(ch))
				{
					System.out.println("Not a valid integer");
					return ;
				}
				if(isNumber(ch) && !alreadyDone)
					res_num=res_num*10+(ch-'0');
//				else
//				{
//					if(alreadyDone)
//					{
//						System.out.println("Not a valid integer");
//						return ;
//					}
//					else
//						alreadyDone=true;
//				}
			}
			System.out.println("Resultant number:- "+res_num);
		}
	}
	
}
