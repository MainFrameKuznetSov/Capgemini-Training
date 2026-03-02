package DesignProblems;

class InvalidInvestmentException extends Exception
{
	public InvalidInvestmentException()
	{
		System.out.println("Validation failure.");
	}
}

class InvestmentRejectedException extends RuntimeException
{
	public InvestmentRejectedException()
	{
		System.out.println("Authorization failure.");
	}
}

abstract class InvestmentTransaction
{
	
}

enum investmentTypeEnum
{
	
}

class Investment
{
	private String transactionId;
	private String investorName;
	private double investedAmount;
	private investmentTypeEnum investmentType; 
	
	public Investment(String transactionId,String investorName,double investedAmount)throws InvalidInvestmentException
	{
		this.transactionId=transactionId;
		this.investorName=investorName;
		if(investedAmount<=0)
			throw new InvalidInvestmentException();
		this.investedAmount=investedAmount;
	}
	
}

public class SecureInvestmentPortfolioEngine 
{
	
}
