package Stacks;

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

public class ValidParanthesis 
{
	
	public static void main(String[] args) 
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
	}
	
}
