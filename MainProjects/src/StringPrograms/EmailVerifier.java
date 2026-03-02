package StringPrograms;

public class EmailVerifier 
{
	
	public static boolean verifyFirstPart(String param)
	{
		int indexOfSpl=param.indexOf('@');
		if(indexOfSpl!=-1)//Presence of additional @ in the first part
		{
			System.out.println("Bhul @");
			return false;
		}
		int size=param.length();
		if(size<1 || size>64)//Not following size constraints
		{
			System.out.println("Bhul length");
			return false;
		}
		for(int i=0;i<param.length();++i)
		{
			char ch=param.charAt(i);
			if(i==0 && (ch<'a' || ch>'z') && (ch<'0' || ch>'9'))//Starts with a special character
			{
				System.out.println("Bhul start");
				return false;
			}
			if(ch=='.' && i>=1 && param.charAt(i-1)=='.')//Consecutive dots
			{
				System.out.println("Bhul . placement");
				return false;
			}
			if((ch!='.' && ch!='_' && ch!='-') && (ch<'a' && ch>'z') && (ch<'0' && ch>'9'))//Invalid character placement
			{
				System.out.println("Bhul character:- "+ch);
				return false;
			}
		}
		return true;
	}
	
	public static boolean verifyLastPart(String param)
	{
		int indexOfDot=param.indexOf('.'),indexOfSpl=param.indexOf('@');
		if(indexOfDot==-1 || indexOfSpl!=-1)//Absence of dot OR presence of @
		{
			System.out.println("Bhul pattern.");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		
		String mailID="0mainframe.comp.prog@gmail.com";
		int indexOfPartition=mailID.indexOf('@');
		if(indexOfPartition==-1)
		{
			System.out.println("Not a valid Mail.");//Absence of @
			return ;
		}
		String domain=mailID.substring(indexOfPartition+1);
		String firstPart=mailID.substring(0,indexOfPartition);
		System.out.println(firstPart);
		System.out.println(domain);
		
		if(verifyFirstPart(firstPart) && verifyLastPart(domain))
			System.out.println("Genuine email");
		else
			System.out.println("Fake email");
		
	}
	
}
