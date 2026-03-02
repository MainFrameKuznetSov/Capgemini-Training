package com.reverser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ReverseTester {

	Reverse reverse=new Reverse();
	static int count=0;
	
	@BeforeEach
	public void starTestMessage()
	{
		System.out.println("Test case "+(++count)+" starting");
	}
	
	@AfterAll
	public void endMessage()
	{
		System.out.println("End of testing.");
	}
	
	@BeforeAll
	public void startMessage()
	{
		System.out.println("Start of testing");
	}
	
	@AfterEach
	public void endTestMessage()
	{
		System.out.println("End of test "+count);
	}
	
	@Test
	void test1() 
	{
		assertEquals("aytidA",reverse.reverseString("Aditya"));
	}
	
	@Test
	void test2()
	{
		assertEquals("udud",reverse.reverseString("dudu"));
	}
	
	@Test
	void test3()
	{
		assertEquals("alhua",reverse.reverseString("halua"));
	}
	
	@Test
	void test4()
	{
		assertEquals("ulaa",reverse.reverseString("aalu"));
	}
	
	@Test
	void test5()
	{
		assertEquals("nijja",reverse.reverseString("ninja"));
	}
	
	@Test
	void test6()
	{
		assertTrue(reverse.isEven(12));
	}
	
	@Test
	void test7()
	{
		assertTrue(reverse.isEven(13),"");
	}

	@Test
	void test8()
	{
		assertArrayEquals(new int[]{2,4,6,8},reverse.filterEven(new int[]{1,2,3,4,5,6,7,8,9}));
	}
	
	@Test
	void test9()
	{
		assertArrayEquals(new int[]{2,4,6},reverse.filterEven(new int[]{1,2,3,4,5,6,7,8,9}));
	}
	
	@Test
	void test10()
	{
		assertArrayEquals(new String[]{"Gour","Gabbar"},reverse.filterGs(new String[]{"Gour","Gabbar","Aalu","Momo"}));
	}
	
	@Test
	void test11()
	{
		try
		{
			int arr[]={12,21};
			for(int i:arr)
				System.out.println(i);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
		}
	}
	
}
