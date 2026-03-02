package CarMaker;

import java.util.Scanner;

public class Driver 
{
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Car car=new Car();
		System.out.println("1) Petrol Engine");
		System.out.println("2) Diesel Engine");
		System.out.println("Enter your choice:- ");
		byte userChoice = userInput.nextByte();
		userInput.nextLine();
		Engine engine=null;
		switch(userChoice)
		{
			default:
			case 1:
					PetrolEngine petrolEngine = new PetrolEngine();
					engine=petrolEngine;
					break;
			case 2:
					DieselEngine dieselEngine = new DieselEngine();
					engine=dieselEngine;
					break;
//			default: 
//					PetrolEngine petrolEngine1 = new PetrolEngine();
//					engine=petrolEngine1;
//					break;
		}
		car.engine=engine;
		System.out.println("Engine in Car:- "+car.engine.getClass());
	}
	
}
