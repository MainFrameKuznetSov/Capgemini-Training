package ObjectToString;

public class Employee 
{
	
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return("Name:- "+this.name+" ID:- "+this.id);
	}
	
	public boolean equals(Employee that)
	{
		if(this==that)
		{
			System.out.println("Both are same objects.");
			return true;
		}
		if(that==null || getClass()!=that.getClass())
		{
			System.out.println("Different classes OR null.");
			return false;
		}
		return (this.id==that.id && this.name.equals(that.name));
	}
	
}
