package ObjectToString;

public class EmployeeDriver 
{
	
	public static void main(String[] args) {
		Employee employee = new Employee(1,"nijja");
		System.out.println(employee);
		Employee employee2 = new Employee(1,"nijja");
		System.out.println(employee2);
		
		System.out.println(employee==employee2);
		System.out.println(employee.equals(employee2));
		
	}

}
