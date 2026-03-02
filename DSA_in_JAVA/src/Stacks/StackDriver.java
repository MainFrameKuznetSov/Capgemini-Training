package Stacks;

import java.util.Scanner;

class CustStack 
{
	private static final int NINF=-1000000000;
	private static int[] stack;
	private static int top;
	private static int capacity;
	
	CustStack()
	{
		this.top=-1;
		this.capacity=100;
		stack=new int[100];
	}
	
	CustStack(int capacity)
	{
		this.top=-1;
		this.capacity=capacity;
		stack=new int[capacity];
	}
	
	public static boolean isFull()
	{
		return (top==capacity-1);
	}
	
	public static boolean isEmpty()
	{
		return (top==-1);
	}
	
	public static void push(int data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack Overflow.");
			return ;
		}
		stack[++top]=data;
		System.out.println("Element pushed successfully.");
	}
	
	public static int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty");
			return NINF;
		}
		System.out.println("Element popped:- "+stack[top]);
		return stack[top--];
	}
	
	public static int peek()
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

public class StackDriver
{
	
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		CustStack stack=new CustStack();
		while(true)
		{
			System.out.println("1) Push Element");
			System.out.println("2) Pop");
			System.out.println("3) Peek");
			System.out.println("4) Display");
			System.out.println("Enter your choice:- ");
			int choice=name.nextInt();
			name.nextLine();
			switch(choice)
			{
				case 1:
					System.out.println("Enter element");
					int element=name.nextInt();
					name.nextLine();
					stack.push(element);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					int data=stack.peek();
					System.out.println("Top element:- "+data);
					break;
				case 4:
					stack.display();
					break;
				default:
					System.out.println("Thanks for using :-) ");
					System.exit(0);
					break;
			}
		}
	}
	
}
