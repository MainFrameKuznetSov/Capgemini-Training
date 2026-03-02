package func_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewExpt00
{
	public static void main(String[] args)
	{
		List<Integer>list=Arrays.asList(10,12,13,19,19);
		Consumer<Integer>c1=new Consumer<>()
		{
			@Override
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};
		Consumer<Integer>c=(i)->System.out.println(i);
//		list.forEach(System.out::println);
		
		/*
		 * STREAMS
		 * 
		 * Methods to lookout for:-
		 * stream()
		 * filter()
		 * forEach()
		 * sorted()
		 * map()
		 * collect()
		 * Collectors()
		 * */
		Stream<Integer>strem=list.stream();
//		strem.forEach(System.out::println);
		Stream<Integer>filtered=list.stream().filter(inp->inp>12);
//		filtered.forEach(System.out::println);
//		list.stream().filter(inp->inp%2==1).sorted().forEach(System.out::println);
		
//		Map<Integer,String>map=new HashMap<>();
//		map.put(1,"Aditya");
//		map.put(2,"DebKumar");
//		map.put(3,"Priyanshu");
//		map.put(4,"Akshat");
//		list.stream().map(null);
		list.stream()//Converts to stream
					.map(i->i*i)//Maps to the square 
							   .collect(Collectors.toSet())//Converts to List/Set(to JCF)
							   							  .forEach(System.out::println);//print
		
		
		
	}
}
