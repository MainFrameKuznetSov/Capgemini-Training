package Objects;

public class User 
{
	
	String email;
	String password;
	String address;
	
	public User(String email,String password) 
	{
		super();
		this.email=email;
		this.password=password;
	}

	public User(String email,String password,String address) 
	{
//		super();
		this(email,password);
		this.address=address;
	}
	
	@Override
	public String toString()
	{
		return "Email: "+this.email+" Password: "+this.password+" Address: "+this.address;
	}
	
}
