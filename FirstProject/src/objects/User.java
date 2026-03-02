package objects;

public class User 
{
	
	String email;
	String password;
	String address;
	
	User(String email,String password)
	{
		this.email=email;
		this.password=password;
	}

	public User(String email, String password, String address) {
		this(email,password);
		this.address=address;
	}
	
	

}
