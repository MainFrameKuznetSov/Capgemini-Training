package PrefixSum;

import java.util.Scanner;

public class ASCIISumEqualsK 
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter a string:- ");
		String input=name.nextLine();
		System.out.println("Enter target value K");
		int K=name.nextInt();
		name.nextLine();
		int len=input.length();
//		int pref[]=new int[len];
////		pref[0]=0;
//		for(int i=0;i<len;++i)
//			pref[i]=(int)(input.charAt(i));
//		for(int i:pref)
//			System.out.print(i+" ");
//		System.out.println();
		int left=0,right=0,windowSum=0;
		while(right<len)
		{
//			windowSum+=pref[right];
			while(windowSum<K)
				windowSum+=input.charAt(right++);
			if(windowSum==K)
			{
				System.out.println("Starting index is:- "+left);
				return ;
			}
			while(windowSum>K)
				windowSum-=input.charAt(left++);
		}
		System.out.println("No such sequence found");
	}
}
