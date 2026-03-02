package SecureBankTransactionEngine;

import java.util.Scanner;

public class BankServer
{
	public static void main(String args[]) throws InvalidAmountException, InsufficientBalanceException
	{
		Scanner userInput = new Scanner(System.in);
		BankAccount user = null;
		while(true)
		{
			System.out.println("1) Open account");
			System.out.println("2) Check balance");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Set new Pin");
			System.out.println("Enter you choice:- ");
			int userChoice = userInput.nextInt();
			userInput.nextLine();
			switch(userChoice)
			{
				case 1:
					System.out.println("Enter your name");
					String name = userInput.nextLine();
					long accNum=(long)(Math.random()*100L);
					BankAccount newUser = new BankAccount(accNum,name);
					user=newUser;
					System.out.println(user.toString());
					break;
				case 2:
					try
					{
						user.getBalance();
					}
					catch(NullPointerException exc)
					{
						System.out.println("Account not created.");
					}
					break;
				case 3:
					System.out.println("Enter amount to deposit");
					double amount = userInput.nextDouble();
					userInput.nextLine();
					try 
					{
						user.deposit(amount);
					} 
					catch(NullPointerException exc)
					{
						System.out.println("Account not created.");
					}
					catch (InvalidAmountException e) 
					{
						throw new InvalidAmountException("Not possible");
					}
					break;
				case 4:
					System.out.println("Enter amount to withdraw");
					amount = userInput.nextDouble();
					userInput.nextLine();
					try 
					{
						user.withdraw(amount);
					} 
					catch(NullPointerException exc)
					{
						System.out.println("Account not created.");
					}
					catch (InsufficientBalanceException e) 
					{
						throw new InsufficientBalanceException("Not possible");
					}
					break;
				case 5:
					user.setPin();
					break;
				default:
					System.out.println("Thanks for using :-)");
					System.exit(0);
					break;
			}
			System.out.println();
		}
	}
}

class BankAccount 
{
	
	static Scanner pinInput = new Scanner(System.in);
	
	private long accountNumber;
	private String holderName;
	private double balance;
	private long pin;
	
	public BankAccount()
	{
		this.balance=100.0d;
		this.pin=123L;
	}
	
	public String toString()
	{
		return "Name:- "+this.holderName+" Account Number:- "+this.accountNumber+" Balance:- "+this.balance;
	}
	
	BankAccount(long accountNumber,String holderName)
	{
		this();
		this.accountNumber=accountNumber;
		this.holderName=holderName;
	}
	
	public void setPin()
	{
		System.out.println("Enter original pin to validate:- ");
		long pinEntry=pinInput.nextLong();
		pinInput.nextLine();
		if(pinEntry!=pin)
		{
			System.out.println("Wrong Pin.");
			return ;
		}
		System.out.println("Enter new pin:- ");
		pinEntry=pinInput.nextLong();
		this.pin=pinEntry;
	}
	
	public long getAccountNumber()
	{
		System.out.println("Account Number:- "+this.accountNumber);
		return this.accountNumber;
	}
	
	public String getHolderName()
	{
		System.out.println("Enter original pin to validate:- ");
		long pinEntry=pinInput.nextLong();
		pinInput.nextLine();
		if(pinEntry!=pin)
		{
			System.out.println("Wrong Pin.");
			return "Not valid user.";
		}
		System.out.println("Name:- "+this.holderName);
		return this.holderName;
	}
	
	public void getBalance()
	{
		System.out.println("Enter original pin to validate:- ");
		long pinEntry=pinInput.nextLong();
		pinInput.nextLine();
		if(pinEntry!=pin)
		{
			System.out.println("Wrong Pin.");
			return ;
		}
		System.out.println("Balance:- "+this.balance);
//		return this.balance;
	}
	
	public void deposit(double amount) throws InvalidAmountException
	{
		System.out.println("Enter original pin to validate:- ");
		long pinEntry=pinInput.nextLong();
		pinInput.nextLine();
		if(pinEntry!=pin)
		{
			System.out.println("Wrong Pin.");
			return ;
		}
		if(amount<=0)
			new InvalidAmountException("Added amount cannot be negative or zero");
		this.balance+=amount;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		System.out.println("Enter original pin to validate:- ");
		long pinEntry=pinInput.nextLong();
		pinInput.nextLine();
		if(pinEntry!=pin)
		{
			System.out.println("Wrong Pin.");
			return ;
		}
		if(amount>this.balance)
			new InsufficientBalanceException("Not enough balance.");
		this.balance-=amount;
	}
	
}

class InvalidAmountException extends Throwable
{
	public InvalidAmountException(String message)
	{
		System.out.println(message);
	}
}

class InsufficientBalanceException extends Throwable
{
	public InsufficientBalanceException(String message)
	{
		System.out.println(message);
	}
}
