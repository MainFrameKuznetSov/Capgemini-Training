package com.reverser;

import java.util.ArrayList;
import java.util.List;

public class Reverse 
{
	public String reverseString(String param)
	{
		int len=param.length();
		String ans="";
		for(int i=len-1;i>=0;--i)
			ans+=param.charAt(i);
		return ans;
	}
	
	public boolean isEven(int param)
	{
		return (param%2==0);
	}
	
	public int[] filterEven(int[] param)
	{
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<param.length;++i)
		{
			if(param[i]%2==0)
				list.add(param[i]);
		}
		int[] ans=new int[list.size()];
		for(int i=0;i<list.size();++i)
			ans[i]=list.get(i);
		return ans;
	}
	
	public String[] filterGs(String[] param)
	{
		List<String>list=new ArrayList<>();
		for(String s:param)
		{
			if(s.charAt(0)=='G')
				list.add(s);
		}
		String ans[]=new String[list.size()];
		for(int i=0;i<list.size();++i)
			ans[i]=list.get(i);
		return ans;
	}
	
}
