package com.practice.java8;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
		
		String ar[] = {"abc","xyz","ijk"};
		Arrays.sort(ar, Comparator.reverseOrder());

		Arrays.stream(ar).forEach(System.out::println);
		
		
		List<String> list = Arrays.stream(ar).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		Set<Integer> s = new HashSet<>();
		s.add(null);
		
		System.out.println(list);

		int a[] = {4,2,2,5,7};
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int x : a) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue() > 1) {
				System.out.println(m.getValue());
			}
		}
	}

}
