package NewDSA;

import java.util.HashMap;

public class FindDefectiveBulb 
{
	
	public static int findDefective(char[] ch)
	{
		int lo=0,hi=ch.length-1,ans=-1;
		while(lo<hi)
		{
			int mid=lo+(hi-lo)/2;
			if(ch[mid]=='F')
			{
				ans=mid;
				hi=mid-1;
			}
			else
				lo=mid+1;
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		char[] ch= {'P','P','P','P','F','F','F','F','F','F'};
		int ans=findDefective(ch);
		System.out.println(ans==-1?"Not found":"Found at index "+ans);
		HashMap<Integer,Integer>map=new HashMap<>();
		map.put(12,9);
	}
}
