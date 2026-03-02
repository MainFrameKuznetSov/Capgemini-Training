package ClassAssesment;

import java.util.Scanner;

class CharCustStack 
{
	private static final char NINF='$';
	private static char[] stack;
	private static int top;
	private static int capacity;
	
	CharCustStack()
	{
		this.top=-1;
		this.capacity=100;
		stack=new char[100];
	}
	
	CharCustStack(int capacity)
	{
		this.top=-1;
		this.capacity=capacity;
		stack=new char[capacity];
	}
	
	public static boolean isFull()
	{
		return (top==capacity-1);
	}
	
	public static boolean isEmpty()
	{
		return (top==-1);
	}
	
	public static void push(char data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack Overflow.");
			return ;
		}
		stack[++top]=data;
//		System.out.println("Element pushed successfully.");
	}
	
	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return ;
		}
//		System.out.println("Element popped:- "+stack[top]);
		--top;
	}
	
	public static char peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return NINF;
		}
		return stack[top];
	}
	
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack.");
			return ;
		}
		System.out.print("Stack:-  ");
		for(int i=top;i>=0;--i)
			System.out.print(stack[i]+" , ");
		System.out.println();
	}
	
}

public class AllProgramsCompiled_Aditya_Mondal 
{
	
	static final int NINF=(int)1e9;
	
	public static void getThirdSmallestElement()
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len=name.nextInt();
		if(len<3)
		{
			System.out.println("Operation not logical");
			return ;
		}
		int arr[]=new int[len];
		for(int i=0;i<len;++i)
		{
			System.out.println("Enter arr["+i+"]:- ");
			arr[i]=name.nextInt();
			name.nextLine();
		}
		int mx=arr[0],mx1=arr[0],mx2=arr[0];
		for(int i=1;i<len;++i)
		{
			if(arr[i]>mx)
			{
				mx2=mx1;
				mx1=mx;
				mx=arr[i];
			}
			if(arr[i]>mx1 && arr[i]<mx)
			{
				mx2=mx1;
				mx1=arr[i];
			}
			if(arr[i]>mx2 && arr[i]<mx && arr[i]<mx1)
				mx2=arr[i];
		}
		System.out.println("Third maximum:- "+mx2);
	}
	
	public static void getSum()
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter no. of rows:- ");
		int n=name.nextInt();
		name.nextLine();
		System.out.println("Enter no. of columns:- ");
		int m=name.nextInt();
		name.nextLine();
		int sum=0;
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				System.out.println("Enter matrix["+i+"]["+j+"] :- ");
				matrix[i][j]=name.nextInt();
				name.nextLine();
				sum+=matrix[i][j];
			}
		}
		System.out.println("Sum of all elements:- "+sum);
	}
	
	public static void checkBalancedParanthesis()
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the expression:- ");
		String expr=name.nextLine();
		int len=expr.length();
		if(len==0)
		{
			System.out.println("Not valid");
			return ;
		}
		CharCustStack stack = new CharCustStack(len);
		for(int i=0;i<len;++i)
		{
			char ch=expr.charAt(i);
			if(stack.isEmpty())
			{
				stack.push(ch);
				continue;
			}
			char topNode=stack.peek();
			if((ch==')' && topNode=='(') || (ch=='}' && topNode=='{') || (ch==']' && topNode=='['))
			{
				stack.pop();
				continue;
			}
			stack.push(ch);
		}
		System.out.println(stack.isEmpty()?"Valid":"Not valid");
		name.close();
	}
	
	public static void hasPattern()
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter full string");
		String mainString=name.nextLine();
		System.out.println("Enter pattern");
		String pattern=name.nextLine();
		int patLen=pattern.length(),len=mainString.length();
		for(int i=0;i+patLen<len;++i)
		{
			String checker=mainString.substring(i,i+patLen);
			if(checker.equals(pattern))
			{
				System.out.println("Pattern found at index "+i);
				return ;
			}
		}
		System.out.println("Pattern not found.");
	}
	
	public static void main(String[] args) 
	{
		getThirdSmallestElement();
		getSum();
		checkBalancedParanthesis();
		hasPattern();
	}
}
