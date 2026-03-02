package CapGQuestion;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class User
{
	private String name;
	private Set<User>followers;
	
	User(String name)
	{
		this.name=name;
		followers=new HashSet<User>();
		System.out.println("User "+name+" added.");
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void update(String message,User followee)
	{
		System.out.println(this.name+" recieved notification: "+followee.getName()+" posted "+message);
	}
	
}

class Platform
{
	private Map<Integer,User> idMap;
	
}

public class SocialNetworkInteractionSystem 
{
	
}
