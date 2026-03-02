package Advance_JAVA.lambdaExpression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Draw
{
	void circle();
//	void rectangle();
}

interface ParameterDraw
{
	void operate(int data);
}

@FunctionalInterface
interface A
{
	void show(String msg);
}

abstract class C1 implements Draw
{}

public class Interface_Experimentation
{
	
	public static int getProduct(int a,int b)
	{
		return a*b;
	}
	
	public static int getSum(int a,int b)
	{
		return a+b;
	}
	
	public static int getDifference(int a,int b)
	{
		return a-b;
	}
	
	public static int getQuotient(int a,int b)
	{
		try
		{
			return a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		return -1;
	}
	
	public void show(String msg)
	{
		System.out.println(msg.toLowerCase());
	}
	
	public static void main(String args[])
	{
		Draw d=()->{System.out.println("C1 draw.");};
		d.circle();
		Draw d2=()->
		{
			System.out.println("New project.");
			System.out.println("C2 draw.");
		};
		d2.circle();
		Function<Integer, Double>f=(n)->Math.sqrt(n);
		System.out.println(f.apply(16));
		Function<Integer, Double>f1=Math::sqrt;
		System.out.println(f1.apply(81));
		BiFunction<Integer, Integer, Integer>f2=Interface_Experimentation::getProduct;
		System.out.println(f2.apply(11,12));
		BiFunction<Integer, Integer, Integer>f3=Interface_Experimentation::getSum;
		System.out.println(f3.apply(11,12));
		BiFunction<Integer, Integer, Integer>f4=Interface_Experimentation::getQuotient;
		System.out.println(f4.apply(11,12));
		BiFunction<Integer, Integer, Integer>f5=Interface_Experimentation::getDifference;
		System.out.println(f5.apply(11,12));
		Interface_Experimentation e = new Interface_Experimentation();
		A a=(msg)->e.show(msg);
		a.show("NEW TRY");
		Queue<Integer>q=new LinkedList<>();
		ArrayList<Integer>list=new ArrayList<>();
		Set<Integer>tree=new TreeSet<>(list);
		
		
	}
}
