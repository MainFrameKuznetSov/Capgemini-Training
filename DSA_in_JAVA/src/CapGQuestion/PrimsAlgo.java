package CapGQuestion;

import java.util.HashMap;

public class PrimsAlgo 
{
	
	static int limit=5;
	
	public static void main(String[] args) 
	{
		int[][] distance={
	            {0, 2, 0, 6, 0},
	            {2, 0, 3, 8, 5},
	            {0, 3, 0, 0, 7},
	            {6, 8, 0, 0, 9},
	            {0, 5, 7, 9, 0}
	        };
		boolean vis[]=new boolean[limit];
		vis[0]=true;
		
		hashCode()
		
//		HashMap<Integer,Integer>=new HashMap<>();
//		HashSet<>
		
		int addedEdge=0,minDist=0;
		while(addedEdge<limit-1)
		{
			int currentMin=Integer.MAX_VALUE,src=-1,dst=-1;
			for(int i=0;i<limit;++i)
			{
				if(vis[i])
				{
					for(int j=0;j<limit;++j)
					{
						if(!vis[j] && distance[i][j]!=0 && distance[i][j]<currentMin)
						{
							src=i;
							dst=j;
							currentMin=distance[i][j];
						}
					}
				}
			}
			vis[dst]=true;
			minDist+=distance[src][dst];
			++addedEdge;
			System.out.println(src+"-->"+dst+" distance:- "+currentMin);
		}
		System.out.println("Minimum distance:-"+minDist);
	}
}
