package CapGQuestion;

import java.util.LinkedHashMap;
import java.util.Map;

class Item
{
	private int id;
	private String name;
	private double price;
	
	Item(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void updatePrice(double newPrice)
	{
		this.price=newPrice;
	}
	
	public double getPrice()
	{
		return price;
	}
	
}

class CartHolder
{
	private int prodId;
	private String name;
	private double price;
	private int qty;
	
	CartHolder(Item item)
	{
		this.prodId=item.getId();
		this.name=item.getName();
		this.price=item.getPrice();
		this.qty=1;
	}
	
	public int getProdId()
	{
		return prodId;
	}
	
	public void addItem()
	{
		++qty;
	}
	
	public double getTotal()
	{
		return (price*qty);
	}
	
	public int getQuantity()
	{
		return qty;
	}
	
	@Override
	public String toString()
	{
		return name+" x "+qty+" = Rs."+getTotal();
	}
	
}

class CartManager
{
	Map<Integer,CartHolder>cartMap=new LinkedHashMap<>();
	
	public void addtoCart(Item item)
	{
		int id=item.getId();
		if(!cartMap.containsKey(id))
			cartMap.put(id,new CartHolder(item));
		else
			cartMap.get(id).addItem();
	}
	
	public double getCartTotal()
	{
		return cartMap.values().stream().
			   mapToDouble(CartHolder::getTotal)
			   .sum();
	}
	
	public void display()
	{
		cartMap.values().forEach(System.out::println);
		System.out.println("Cart total:- Rs."+getCartTotal());
	}
	
}

public class CartDriver 
{
	public static void main(String args[])
	{
		CartManager cart=new CartManager();
		Item laptop=new Item(1,"Laptop",60000);
		Item UEM=new Item(2,"UEM",1500000);
		cart.addtoCart(UEM);
		cart.addtoCart(UEM);
		cart.addtoCart(laptop);
		cart.addtoCart(UEM);
		cart.display();
	}
}
