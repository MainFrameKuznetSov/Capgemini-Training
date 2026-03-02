package streams_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Batch1 
{
	public static void main(String[] args) 
	{
		/*
		 * Task 1:- Given a List<Integer> numbers,
					return a new List<Integer> containing only even numbers, sorted in ascending order.
		 * */
		List<Integer>list=Arrays.asList(10,31,45,9,1,2,6,7);
		List<Integer>newImmutableList=list.stream().filter(i->i%2==0).sorted().toList();
		//newImmutableList.add(19);//Will result in Exception(UnsupportedOperationException)
		newImmutableList.forEach(System.out::println);
		//Above code returns an immutable list.
		List<Integer>newMutableList=list.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
		newMutableList.add(17);
		newMutableList.forEach(System.out::println);
		
		/*
		 * Task 2:- Given a List<String> names,
					return a Map<Integer, List<String>> where:
					Key → length of string
					Value → list of all strings having that length
		 * */	
		 List<String>nameList=Arrays.asList("DRam","Shyam","Jodu","Modu","Ling","Niggaji","Aditya");
		 Map<Integer,List<String>>resultMap = nameList.stream().//Converts to stream
				 							  collect(Collectors.//Collect
				 							  groupingBy(String::length));//Maps with length
		 System.out.println(resultMap);
		 //For sorted keys, we need a TreeMap
		 Map<Integer,List<String>>sortedMap = nameList.stream().
				 							  collect(Collectors.
				 							  groupingBy(String::length,//Function to map key
				 							  TreeMap::new,//Changes to TreeMap(Sorted by key)
				 							  Collectors.toList()//Changes to a List
				 							  ));
		 System.out.println(sortedMap);
		 
		 /*
		  * Task 3:- Given a List<String> words,find the first non-repeating character across all words combined.
					 Return it as:
							Optional<Character>
		  * */
		 
		 List<String>words=Arrays.asList("khoka","babu","jaay","laal","juto","paye");
		 Optional<Character>result=words.stream().//Converts to string
				 				   flatMap(word->word.chars().//Extracts characters from a single word(in IntStream i.e. ASCII)
				 				   mapToObj(i->(char)i)).//Typecase IntStream to Stream<Character>
				 				   collect(Collectors.groupingBy(
				 				   ch->ch,//Group by character itself
				 				   LinkedHashMap::new,//Change to LinkedHashMap for preserving insertion order
				 				   Collectors.counting()//count character frequency
				 				   )).
				 				   entrySet().//
				 				   stream().
				 				   filter(key->key.getValue()==1).
				 				   map(key->key.getKey()).
				 				   findFirst();
		 System.out.println(result);
		 
	}
}

//Top top=new Top();
//Thread t1=new Thread(top);
//Thread t2=new Thread(top);
//t1.start();
//t2.start();
///*
// * Without t1.join(), the 'main()' thread executes before the thread scheduler assigns resources to the 't1' thread.
// * */
//try {
//	t1.join();
//	/*
//	 * Using t1.join(), we actually suggest the thread scheduler to wait for 't1' to complete and then end the 'main'
//	 * thread
//	 * */
//	t2.join();
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//System.out.println(top.counter);

//class Top implements Runnable
//{
//	
//	int counter=0;
//	
//	//Not using synchronized leads to race condition where both threads t1 and t2 try to update counter and cause 
//	//faulty updates leading to data loss.
//	synchronized public void execute()									
//	{
//		++counter;
//	}
//	
//	@Override
//	public void run()
//	{
//		for(int i=1;i<=50000;++i)
//			execute();
//	}
//}

