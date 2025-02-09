package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsClassExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Mumbai", "Bangalore", "Delhi", "Hyderabad","Haryana");
		
		System.out.println("Converting to List: "+list.stream().collect(Collectors.toList()));
		System.out.println("Converting to Set: "+list.stream().collect(Collectors.toSet()));
		System.out.println("Converting to Map: "+list.stream().collect(Collectors.toMap(l->l, l-> l.length())));
		
		System.out.println("Joining elements into a String: "+list.stream().collect(Collectors.joining()));
		
		System.out.println("Grouping elements: "+list.stream().collect(Collectors.groupingBy(l -> l.charAt(0))));

		
		List<Integer> sum = Arrays.asList(3,7,1,90,4);
		
		System.out.println("Sume of int values: "+sum.stream().collect(Collectors.summingInt(i -> Integer.valueOf(i))));
		
		System.out.println("Sum of int values: "+sum.stream().collect(Collectors.summingInt(Integer :: intValue)));
		
		System.out.println("average of int stream: "+sum.stream().collect(Collectors.averagingInt(i -> i)));
		
		System.out.println("average of int stream: "+sum.stream().collect(Collectors.averagingInt(Integer::intValue)));
		
		System.out.println("Partitioning even/odd elements: "+sum.stream().collect(Collectors.partitioningBy(n -> n%2 ==0)));
		
		System.out.println("Counting elements: "+sum.stream().collect(Collectors.counting()));
		
		System.out.println("Reducing elements: "+sum.stream().collect(Collectors.reducing(0, (a,b) -> a+b)));
		


		
		
	}

}
