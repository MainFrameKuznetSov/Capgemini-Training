package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Job
{
	public int start;
	public int end;
	public int profit;
	Job(int start,int end,int profit)
	{
		this.start=start;
		this.end=end;
		this.profit=profit;
	}	
}

public class MaxProfitScheduling 
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		int n=name.nextInt();
		name.nextLine();
		Job jobs[]=new Job[n];
		
		Arrays.sort(jobs,new Comparator<Job>() 
		{
			public int compare(Job a,Job b)
			{
				return a.end-b.end;
			}
		});
		int dp[]=new int[n];
		dp[0]=jobs[0].profit;
		for(int i=1;i<n;++i)
		{
			int notTake=dp[i-1],Take=jobs[i].profit;
			for(int j=i-1;j>=0;--j)
			{
				if(jobs[j].end<=jobs[i].start)
				{
					Take+=jobs[j].profit;
					break;
				}
			}
			dp[j]=Math.max(notTake, Take);
		}
		System.out.println(dp[n-1]);
	}
}
