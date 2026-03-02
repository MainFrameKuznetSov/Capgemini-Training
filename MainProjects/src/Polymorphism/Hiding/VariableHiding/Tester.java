package Polymorphism.Hiding.VariableHiding;

public class Tester 
{
	
	int f=10;
	static int s=20;
	
	void display()
	{
		int f=30;
		int s=40;
		System.out.println(f);
		System.out.println(this.f);
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(Tester.s);
	}
	
	public static void main(String[] args) 
	{
		Tester tester = new Tester();
		tester.display();
	}
	
}
