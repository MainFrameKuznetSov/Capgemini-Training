package CapGQuestion;

interface Sport
{
	public void calculateAvgAge(int[] age);
	public void retirePlayer(int id);
}

abstract class MainLogic implements Sport// Abstract will be preferred as the existence of this entity is not real 
{
	
	protected int[] playerIDs;//It should be protected as only child classes should be able to use not others
	
	MainLogic(String sportName)//Generalises as per the sport
	{
		this.playerIDs=new int[12];//Question mentions 1-indexed
		for(int i=1;i<=11;++i)//Can also use Arrays.fill()
			playerIDs[i]=1;
		System.out.println("A new "+sportName+" team has been formed.");
	}
	
	public void calculateAvgAge(int[] age) 
	{
		double avg=0.0;
		int sum=0;
		for(int i=1;i<=11;++i)
		{
			if(playerIDs[i]!=-1)
				sum+=age[i];
		}
		avg=(double)sum/11.0;
		System.out.printf("The average age of team is:- %.2f%n",avg);//Upto 2 decimal places
	}
	
	public void retirePlayer(int id) 
	{
		if(id<1 || id>11)
		{
			System.out.println("Not valid ID.");
			return ;
		}
		if(playerIDs[id]==1)
		{
			playerIDs[id]=-1;
			System.out.println("Player with id: "+id+" has retired.");
		}
		else
			System.out.println("Player has already retired.");
	}
	
}

class Cricket extends MainLogic
{
	Cricket()
	{
		super("cricket");
	}
}

class Football extends MainLogic
{
	Football()
	{
		super("football");
	}
}

public class SportsDriver 
{
	
	public static void main(String args[])
	{
		Cricket team1=new Cricket();
		int []age= {1,1,1,1,1,1,1,1,1,1,1,1};
		team1.calculateAvgAge(age);
		team1.retirePlayer(2);
		team1.calculateAvgAge(age);
		System.out.println();
		Football team2=new Football();
		int []age1= {1,1,1,1,1,1,11,12,1,1,1,1};
		team2.calculateAvgAge(age1);
		team2.retirePlayer(6);
		team2.calculateAvgAge(age1);
	}
	
}
