package Has_A.Bi;

public class DriverClass 
{
	public static void main(String[] args) 
	{	

		Engine engine = new Engine();
//		Car car=new Car();
		System.out.println(engine.noOfCylinders);
		System.out.println(new Car().engine.noOfCylinders);
		System.out.println(new Engine().car.color);
		
	}
}
