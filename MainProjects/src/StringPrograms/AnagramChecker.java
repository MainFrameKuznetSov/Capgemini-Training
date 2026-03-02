package StringPrograms;

public class AnagramChecker 
{
	
	public static int[] getFrequency(String param)
	{
		int freq[]=new int[26];
		for(int i=0;i<=25;++i)
			freq[i]=0;
		for(int i=0;i<param.length();++i)
			++freq[param.charAt(i)-'a'];
		return freq;
	}
	
	public static boolean isAnagram(String param1,String param2)
	{
		if(param1.length()!=param2.length())
			return false;
		int[] freqP1=getFrequency(param1),freqP2=getFrequency(param2);
		for(int i=0;i<26;++i)
		{
			if(freqP1[i]!=freqP2[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		String s1="listen",s2="silent";
		if(isAnagram(s1,s2))
			System.out.println("Both are Anagrams");
		else
			System.out.println("Not anagrams");
		
	}
}
