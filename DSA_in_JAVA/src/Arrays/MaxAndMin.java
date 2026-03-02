package Arrays;

import java.util.Scanner;

public class MaxAndMin 
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter length:- ");
		int n=name.nextInt();
		name.nextLine();
		int array[]=new int[n];
		for(int i=0;i<n;++i)
		{
			System.out.println("Enter array["+i+"] :- ");
			array[i]=name.nextInt();
		}
		int mx=array[0],mn=array[0];
		for(int i=1;i<n;++i)
		{
			mx=array[i]>mx?array[i]:mx;
			mn=array[i]<mn?array[i]:mn;
		}
		System.out.println("Maximum:- "+mx);
		System.out.println("Minimum:- "+mn);
	}
}
