package StringPrograms;

public class RemoveRepeatingCharacter 
{

	static int[] freq=new int[26];
	/*
	 * Mapping lower case letters with their corresponding 0-based position in the alphabet i.e.
	 * 'a' --> 0
	 * b --> 1
	 * c --> 2
	 * .
	 * .
	 * .
	 * z ---> 25int len=input.length();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<len;++i)
		{
			char ch=input.charAt(i);
			++freq[ch-'a'];
			boolean flag=false;
			for(int j=i+1;j<len;++j)
			{
				if(input.charAt(j)==ch)
				{
					flag=true;
					break;
				}
			}
			result.append(ch);
			if(flag || freq[ch-'a']>1)
			{
				for(int j=1;j<=freq[ch-'a'];++j)
					result.append(ch);
			}
		}
	 * 
	 * This will be achieved by the difference between the ASCII value of the current character from the ASCII 
	 * value of 'a'
	 * 
	 * So, roughly it works on the principle
	 * INCREMENT the FREQUENCY of [ASCII of 'i' the character - ASCII of 'a'(the character literal)]
	 * Now, the ASCII of 'a' is 97
	 * Say, we take an example of 'j' whose ASCII is 106 
	 * 
	 * Difference between the ASCII:- 106-97=9
	 * 9th index is technically the 10th block of memory and 'j' is the 10th alphabet 
	 * SO, INCREMENTING the 10th memory block basically counts the number of 'j'
	 * 
	 * */
	
	public static StringBuilder executeLogic(StringBuilder param)
	{
		int len=param.length();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<len;++i)
		{
			char ch=param.charAt(i);
			++freq[ch-'a'];
			boolean flag=false;
			for(int j=i+1;j<len;++j)
			{
				if(param.charAt(j)==ch)
				{
					flag=true;
					break;
				}
			}
			result.append(ch);
			if(flag || freq[ch-'a']>1)
			{
				for(int j=1;j<=freq[ch-'a'];++j)
					result.append(ch);
			}
		}
		return result;
	}	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder input=new StringBuilder("beautiful");
		System.out.println(executeLogic(input));
	}

}
