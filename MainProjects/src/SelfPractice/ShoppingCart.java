package SelfPractice;

import java.util.LinkedList;
import java.util.List;

class Item
{
	private String name;
	private String brand;
	private double price;
	
	public Item() {
		super();
	}

	public Item(String name, String brand, double price) 
	{
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

public class ShoppingCart 
{
	public static void main(String[] args) {
		List<Item>shoppingCart=new LinkedList<>();
		
	}
}
