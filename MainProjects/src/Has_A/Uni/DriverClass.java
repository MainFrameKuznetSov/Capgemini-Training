package Has_A.Uni;

public class DriverClass 
{
	public static void main(String[] args) 
	{	

		Engine engine = new Engine();//Created Engine
		Car car = new Car();//Created Car
		System.out.println(car.color);
		car.engine=engine;//Fitting ENGINE inside the CAR
		System.out.println(car.engine.noOfCylinders);
		System.out.println(car.engine.car);
		engine.car=car;//CAR assigned to the ENGINE
		System.out.println(car.engine.car);
		
	}
}
