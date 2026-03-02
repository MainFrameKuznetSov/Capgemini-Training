package streams_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Batch2 {

	public static boolean isPrime(int param)
	{
		if(param<2)
			return false;
		for(int i=2;i*i<=param;++i)
		{
			if(param%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Task:- 1
		 * Given a List<String> names,return a List<String> containing only the names that:
		   - Start with the letter 'A'
		   - Converted to uppercase
		   - Sorted alphabetically
		 * */
		List<String>list=Arrays.asList("Aditya","Aniket","Subham","Ling");
		List<String>newList=list.stream()
							.filter(i->!(i.isEmpty()) && i.charAt(0)=='A')
							.map(i->i.toUpperCase())
							.sorted()
							.toList();
		newList.forEach(System.out::println);
		
		/*
		 * Task:- 2
		 * Given a List<Integer> numbers,return a Map<Boolean, List<Integer>> that:
		   - true → contains all prime numbers
		   - false → contains all non-prime numbers
		 * */
		List<Integer>numbers=Arrays.asList(2,3,4,5,6,7,8,9);
		Map<Boolean,List<Integer>>result=numbers.stream()	
										 .collect(
										 Collectors.partitioningBy(i->isPrime(i)));
		System.out.println(result);
		
		/*
		 * Task:- 3
		 * Input
		 * ["Java is great", "Java is powerful", "Streams are powerful"]
		 * Output
		 * {
  				java=2,
  				is=2,
  				great=1,
  				powerful=2,
  				streams=1,
  				are=1
		   }
		 * 
		 * */
		List<String>wordList=Arrays.asList("Java is great","Java is powerful","Streams are powerful");
		Map<String,Long>resultMap=
				        wordList.stream()//Converts to stream
						.flatMap(i->Arrays.stream(i.split(" ")))//Using split we get String[] and to convert it to stream using Arrays.stream()
						.map(String::toLowerCase)//Convert to LowerCase
						.collect(//Collect
						Collectors.groupingBy(//Grouping function
						word->word,//Tokenizing technique(word for word)
						Collectors.counting()//Counting frequency 
						));
		System.out.println(resultMap);
		
	}

}
