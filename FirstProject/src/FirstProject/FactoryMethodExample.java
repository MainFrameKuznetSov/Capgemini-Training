package FirstProject;

public class FactoryMethodExample 
{
	public static String whatIsIt(char c)
	{
		if(c==' ')
			return "Blank Space";
		else if(c>='0' && c<='9')
			return "Numeric";
		else if(c>='a' && c<='z')
			return "LowerCase";
		else if(c>='A' && c<='Z')
			return "UpperCase";
		return null;
	}
}
