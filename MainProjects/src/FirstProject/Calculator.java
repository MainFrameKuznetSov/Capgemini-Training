package FirstProject;

import java.util.Scanner;

//

class Expression
{
	public double oper1,oper2;
	public char operation;
	
	Expression()
	{
		this.oper1=0.0;
		this.oper2=0.0;
		this.operation='+';
	}
	
	
	Expression(double oper1,char operation,double oper2)
	{
		this.oper1=oper1;
		this.oper2=oper2;
		this.operation=operation;
	}
}

public class Calculator 
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static Expression takeData()
	{
		System.out.println("Enter first operand");
		double oper1=userInput.nextDouble();
		userInput.nextLine();
		System.out.println("Enter operator (+,-,*,/)");
		char operation=userInput.next().charAt(0);
		System.out.println("Enter second operand");
		double oper2=userInput.nextDouble();
		userInput.nextLine();
		Expression expression = new Expression(oper1,operation,oper2);
		return expression;
	}
	
	public static boolean newChoice()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Press 'Y' or 'y' to do another operation");
		char userChoice=userInput.next().charAt(0);
		if(userChoice!='Y' && userChoice!='y')
			return false;
		return true;
	}
	
	public static void add(double param1,double param2)
	{
		System.out.println("Result:- "+(param1+param2));
	}
	
	public static void subtract(double param1,double param2)
	{
		System.out.println("Result:- "+(param1-param2));
	}
	
	public static void multiply(double param1,double param2)
	{
		System.out.println("Result:- "+(param1*param2));
	}
	
	public static void divide(double param1,double param2)
	{
		if(param2==0.0d)
		{
			System.out.println("Division by zero not possible");
			return ;
		}
		System.out.println("Result:- "+(param1/param2));
	}
	
	public static void main(String args[])
	{
//		Scanner userInput = new Scanner(System.in);
		while(true)
		{
			Expression expression = takeData();
			double operand1=expression.oper1,operand2=expression.oper2;
			char operations=expression.operation;
			switch(operations)
			{
				case '+':
					add(operand1,operand2);
					break;
				case '-':
					subtract(operand1,operand2);
					break;
				case '*':
					multiply(operand1,operand2);
					break;
				case '/':
					divide(operand1,operand2);
					break;
				default :
					System.out.println("Invalid operation.");
					break;
			}
			if(!newChoice())
			{
				System.out.println("Thanks for using :-) ");
				break;
			}
		}
		userInput.close();
	}
}
