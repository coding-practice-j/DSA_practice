package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExamples {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Amit", "Rahul", "Deepa", "Suresh", "Anant");
		// Create a stream object from the list
        //Stream<String> stream = names.stream();
		names.stream().sorted().forEach(System.out::println);		//forEach to print the sorted elements of the list names
		
		names.stream()
			.filter(name -> name.startsWith("D"))					//filter out the elements
			.map(String::toUpperCase)								//map to transform the elements
			.forEach(n -> System.out.println("using filter and map:: "+n));	
		
		List<String> newList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println("using collect:: "+ newList);			//collect into a separate list
		
		//Sum of integers using the reduce(initial value of the sum, and variables) method (which reduce the stream into a single value)
		List<Integer> numbers = Arrays.asList(4,8,9,2,5);
		int sum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println("Sum of the numbers of list: "+sum);
		
		System.out.println("count of numbers list: "+numbers.stream().count());		//Total number of elements in the list
		
		numbers.stream().limit(3).forEach(System.out::println); 		//limit the size of the stream
		
		numbers.stream().skip(3).forEach(System.out::println);  		//skip the first n elements from the list

		//streaming nested collections using flatMap(), list of list
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("Dog ", "cat "), 
													Arrays.asList("kangaroo ", "panda "));
		nestedList.stream().flatMap(List::stream).forEach(System.out::print);
		
		String firstName = nestedList.stream().flatMap(List::stream).findFirst().orElse("No Elements");
		System.out.println("findFirst element using flatMap: "+ firstName);
		
		System.out.println("anyMatch: "+names.stream().anyMatch(name -> name.startsWith("s"))); //anyMatch present in the list
		
		Map<Object, List<String>> groupByLetter = names.stream().collect(Collectors.groupingBy(s-> s.charAt(0)));
													//.collect(Collectors.groupingByConcurrent(s -> s.contains("a")));
		System.out.println("groupingBy based on first index: "+ groupByLetter);
		
		names.parallelStream().forEach(n -> System.out.println("parallelStream: "+ n + "- " + Thread.currentThread().getName()));
		
	}

}
