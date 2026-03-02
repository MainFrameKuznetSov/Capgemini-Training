package CapGQuestion;

interface Bank
{
	public void assignLoans(int[] loans);
	public void averageLoan();
	public void maxLoan();
	public void minLoan();
}

abstract class LoanHandler implements Bank
{
	
	protected int[] loanAmounts;
	
	LoanHandler(int clients)
	{
		loanAmounts=new int[clients];
		for(int i=0;i<clients;++i)
			loanAmounts[i]=0;
	}
	
	public void assignLoans(int[] loans) 
	{
		int preLen=this.loanAmounts.length,newLen=loans.length;
		for(int i=0;i<Math.min(preLen,newLen);++i)
			loanAmounts[i]=loans[i];
		System.out.println("Loans for clients processed");
	}
	
	public void averageLoan() 
	{
		int sum=0;
		for(int i:loanAmounts)
			sum+=i;
		double avg=(double)sum/(double)loanAmounts.length;
		System.out.printf("Average loan amounts for clients is:- %0.2f%n",avg);
	}
	
	public void maxLoan() 
	{
		int ans=-1;
		for(int i:loanAmounts)
			ans=Math.max(ans,i);
		System.out.println("Maximum loan amount:- "+ans);
	}
	
	public void minLoan() 
	{
		int ans=Integer.MAX_VALUE;
		for(int i:loanAmounts)
			ans=Math.min(ans,i);
		System.out.println("Minimum loan amount:- "+ans);
	}
	
}

class PersonalLoanDept extends LoanHandler
{
	PersonalLoanDept(int clients)
	{
		super(clients);
	}
}

class BusinessLoanDept extends LoanHandler
{
	BusinessLoanDept(int businesses)
	{
		super(businesses);
	}
}

public class BankDriver 
{
	public static void main(String[] args) {
		
	}
}
