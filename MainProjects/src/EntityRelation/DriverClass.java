package EntityRelation;

public class DriverClass 
{
	public static void main(String[] args) 
	{	

		Engine engine = new Engine();
		System.out.println(engine.noOfCylinders);
		System.out.println(new Car().engine.noOfCylinders);
		
	}	
}
