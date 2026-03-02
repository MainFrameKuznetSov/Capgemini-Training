package streams_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	
	String name;
	String department;
	double salary;
	
	Employee(String name,String department,double salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	@Override
	public String toString()
	{
		return "Name:- "+this.name+", Department:- "+this.department+", Salary:- "+this.salary;
	}
	
}

public class Batch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Task 1:- 
		 * Given a List<Integer> numbers, return the second highest number using Stream API.
		 * */
		
		List<Integer>list=Arrays.asList(10,20,30,30,25);
		Optional<Integer>secondMax=list.stream()//Convert to stream
					  .distinct()//Only keeps distinct elements
					  .sorted(Comparator.reverseOrder())//sorts in descending order
					  .skip(1)//skips first element in the descending list
					  .findFirst();//returns first elements
		System.out.println(secondMax);
		
		/*
		 * Task 2:-
		 * Given a List<String> names, return the longest string using Stream API.
		 * If multiple strings have the same maximum length, return any one of them.
		 * */
		
		List<String>names=Arrays.asList("Ram","Shyam","Amit","Anirudh","Bob");
		Optional<String>findLongest=names.stream()//
									.max(Comparator.comparing(//compares on length and then returns the maximum
									 String::length));
		System.out.println(findLongest);
		
		/*
		 * Notes for the code above
		 * Use Comparator.comparingInt() instead of Comparator.comparing() because
		 * - comparing() uses boxed Integer
		 * - comparingInt() avoids boxing (better performance)
		 * */
		
		/*
		 * Task 3:-
		 * Given a List<Employee> employees,
		 * find the department which has the highest average salary.
		 * */
					
		List<Employee>empList=Arrays.asList(new Employee("A","IT",10000d),new Employee("B","HR",8000d),
											new Employee("C","IT",12000d),new Employee("D","HR",9000d),
											new Employee("E","Sales",15000d));
		Optional<String>findMaxEarningDept=empList.stream()//change to Stream<Employee>
											 .collect(
											  Collectors.groupingBy(
											  Employee::getDepartment,//group by Department
											  Collectors.averagingDouble(Employee::getSalary)//compute average salary per dept.
											  ))//Got Map<String,Double> as it maps Department -> Avg. salary
											 .entrySet()//Convert map into Set<Map.Entry<String, Double>>
											 .stream()//Change to stream
											 .max(Comparator.comparing(Map.Entry::getValue))//compare with value of average(double)
											 .map(Map.Entry::getKey);//get the corresponding key
		System.out.println(findMaxEarningDept);
		
	}

}
