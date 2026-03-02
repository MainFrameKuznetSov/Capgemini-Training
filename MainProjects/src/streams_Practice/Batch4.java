package streams_Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Batch4 
{
	public static void main(String[] args) 
	{
		/*
		 * Task 1:-
		 * Find the highest paid employee in each department.
		 * */
		List<Employee>list=Arrays.asList(new Employee("A","IT",10000d),new Employee("B","HR",8000d),
										 new Employee("C","IT",12000d),new Employee("D","HR",9000d),
										 new Employee("E","Sales",15000d));	
		Map<String,Optional<Employee>>result=list.stream()
											 	 .collect(
											 	  Collectors.groupingBy(
											 	  Employee::getDepartment,//groups by departement
											 	  Collectors.maxBy(Comparator.//returns the maximum
											 	  comparing(Employee::getSalary))//comparing by salary
											 	  ));
		System.out.println(result);
		
		/*
		 * Task 2:-
		 * 
		 * */
		
	}
}
