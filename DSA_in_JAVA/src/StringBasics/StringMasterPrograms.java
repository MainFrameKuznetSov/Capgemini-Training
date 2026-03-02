package StringBasics;

import java.util.Scanner;

class Pair
{
	int first;
	int second;
	
	Pair()
	{
		this.first=0;
		this.second=0;
	}
	
}

public class StringMasterPrograms 
{
	public static int getCharacterCount(String param)
	{
		int count=0;
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch!=' ')
				++count;
		}
		return count; 
	}
	
	public static Pair getVowelAndConsonantCount(String param)
	{
		Pair pair=new Pair();
		param=param.toUpperCase();
		int countVow=0,countCons=0;
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch==' ')
				continue;
			else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				++countVow;
			else
				++countCons;
		}
		pair.first=countVow;
		pair.second=countCons;
		return pair;
	}
	
	public static String reverseString(String param)
	{
		int len=param.length();
		String ans="";
		for(int i=0;i<len;++i)
			ans+=param.charAt(len-i-1);
		return ans;
	}
	
	public static boolean areEqual(String param1,String param2)
	{
		int len=param1.length();
		if(param2.length()!=len)
			return false;
		for(int i=0;i<len;++i)
		{
			if(param1.charAt(i)!=param2.charAt(i))
				return false;
		}
		return true;
	}
	
	public static String toUpperCase(String param)
	{
		String ans="";
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch>='a' && ch<='z')
				ans+=(char)(ch-32);
			else
				ans+=ch;
		}
		return ans;
	}
	
	public static String toLowerCase(String param)
	{
		String ans="";
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch>='A' && ch<='Z')
				param+=(char)(ch+32);
			else
				param+=ch;
		}
		return ans;
	}
	
	public static int getLength(String param)
	{
		int len=0,ind=0;
		for(;;)
		{
			try
			{
				char ch=param.charAt(ind++);
				++len;
			}
			catch(Exception e)
			{
				return len;
			}
		}
	}
	
	public static String removeSpace(String param)
	{
		String ans="";
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch!=' ')
				ans+=ch;
		}
		return ans;
	}
	
	public static int countWords(String param)
	{
		int wordCount=0;
		param+=" ";
		for(int i=0;i<param.length();++i)
		{
			if(param.charAt(i)==' ')
				++wordCount;
		}
		return wordCount;
	}
	
	public static boolean isBinary(String param)
	{
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(ch!='0' && ch!='1')
				return false;
		}
		return true;
	}
	
	public static int[] getFrequency(String param)
	{
		int count[]=new int[256];
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			++count[(int)ch];
		}
		return count;
	}
	
	public static boolean isPalindrome(String param)
	{
		int l=0,r=param.length()-1;
		while(l<r)
		{
			if(param.charAt(l++)!=param.charAt(r--))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter a string:- ");
		String str=name.nextLine();
		System.out.println(str+" is "+(isPalindrome(str)?"a Palindrome":"not a palindrome."));
//		System.out.println(toUpperCase(str));
		System.out.println(getLength(str));
	}
	
}
