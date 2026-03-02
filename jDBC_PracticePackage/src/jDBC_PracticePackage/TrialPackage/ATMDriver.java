package jDBC_PracticePackage.TrialPackage;

import java.util.Scanner;

@SuppressWarnings("serial")
class WrongPinAttemptsExceededException extends RuntimeException
{
	public WrongPinAttemptsExceededException()
	{
		super("Mistake attempts exceeded.");
	}
}

/*
 *
 * 
 * 
*/

class Service
{
	
	@SuppressWarnings("unused")
	private long accno;
	private int pin;
	private int limit;
	private double balance;
	
	static int mistakeCount;
	static Scanner s=new Scanner(System.in);
	
	Service(long accno)
	{
		this.accno=accno;
		int randomPin=(int)(1000d*Math.random());
		System.out.println("Pin generated:- "+randomPin);
		this.pin=randomPin;
		mistakeCount=0;
		this.limit=3;
		this.balance=69d;
	}
	
	public double getBalance()
	{
		System.out.println("Enter pin:- ");
		int userPin=s.nextInt();
		s.nextLine();
		if(userPin!=this.pin)
		{
			System.out.println("Wrong PIN");
			++mistakeCount;
			try 
			{
				if(mistakeCount==limit)
					throw new WrongPinAttemptsExceededException();
			}
			catch(WrongPinAttemptsExceededException e)
			{
				System.out.println(e.getMessage());
				System.exit(0);
			}
			System.out.println("Attempts left:- "+(this.limit-mistakeCount));
			return -1.0d;
		}
		return this.balance;
	}
	
	public void deposit(double amount)
	{}
	
	public void withdraw(double amount)
	{}
	
}

/*
*
* 
* 
*/

public class ATMDriver 
{
	public static void main(String args[])
	{
		Service service=new Service(108969L);
		while(true)
		{
			double balance=service.getBalance();
			if(balance!=-1.0d)
			{
				System.out.println("Balance:- "+balance);
				break;
			}
		}
	}
}
