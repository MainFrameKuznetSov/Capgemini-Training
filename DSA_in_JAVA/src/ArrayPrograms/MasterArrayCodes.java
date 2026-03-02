package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

class Pair
{
	int first;
	int second;
	
	Pair()
	{
		this.first=0;
		this.second=0;
	}
	
}

public class MasterArrayCodes 
{
	
	public static void printArray(int arr[])
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static int getSum(int arr[])
	{
		int sum=0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
	
	public static double getAverage(int arr[])
	{
		int sum=0;
		for(int i:arr)
			sum+=i;
		return ((double)sum/(double)arr.length);
	}
	
	public static Pair getOddAndEvenCount(int arr[])
	{
		int countOdd=0,countEven=0;
		for(int i:arr)
		{
			if((i&1)==1)
				++countOdd;
			else
				++countEven;
		}
		Pair pair=new Pair();
		pair.first=countOdd;
		pair.second=countEven;
		return pair;
	}
	
	public static int isPresent(int arr[],int target)
	{
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]==target)
				return i;
		}
		return -1;//Not present
	}
	
	public static int getSecondLargest(int arr[])
	{
		int mx=arr[0],mx2=arr[0];
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]>mx)
				mx=arr[i];
			if(arr[i]>mx2 && arr[i]<mx)
				mx2=arr[i];
		}
		return mx2;
	}
	
	public static void reverse(int array[])
	{
		int l=0,r=array.length-1;
		while(l<r)
		{
			int temp=array[l];
			array[l]=array[r];
			array[r]=temp;
			++l;
			--r;
		}
	}
	
	public static boolean isSorted(int arr[])
	{
		int len=arr.length;
		if(len==1)
			return true;
		boolean flag=(arr[0]>arr[1])?true:false;//True if descending(first 2) and false if ascending(first 2)
		for(int i=2;i<len;++i)
		{
			if(flag)
			{
				if(arr[i]>arr[i-1])
					return false;
			}
			else
			{
				if(arr[i]<arr[i-1])
					return false;
			}
		}
		return true;
	}
	
	public static int getDuplicateCountBrute(int arr[])
	{
		int count=0,n=arr.length;
		for(int i=0;i<n;++i)
		{
			for(int j=i+1;j<n;++j)
			{
				if(arr[i]==arr[j])
				{
					++count;
					break;
				}
			}
		}
		return count;
	}
	
	public static int getDuplicateCountOptimal(int arr[])
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int i:arr)
			set.add((Integer)i);
		return arr.length-set.size();
	}
	
	public static void main(String[] args) {
		
	}
	
}
