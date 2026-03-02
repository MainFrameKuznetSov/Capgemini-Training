package Objects;

public class UserDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		User user1=new User("email","password");
		System.out.println(user1);
		User user2=new User("email","password","address");
		System.out.println(user2);
	}

}
