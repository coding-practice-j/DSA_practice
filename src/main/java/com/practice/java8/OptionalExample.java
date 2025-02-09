package com.practice.java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        
        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1).get());
        System.out.println("ofNullable on Empty Optional answer2: " + Optional.ofNullable(answer2));
        //System.out.println("ofNullable on Empty Optional answer2: " + Optional.ofNullable(answer2).get());	//NoSuchElementException
        
        // java.lang.NullPointerException
        //System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
        
        
        System.out.println(gender.isPresent());	//isPresent()
        
        Optional<String> empty = Optional.empty();		 			//empty()
        System.out.println(empty.isPresent());		
        // Optional object with the static of API:
        String name = "Ramesh";
        Optional.of(name);
        gender.ifPresent(str -> System.out.println(str.length()));		//ifPresent()
        
        System.out.println(Optional.ofNullable(answer2).orElse("Ramesh"));			//orElse()
        System.out.println(Optional.ofNullable(answer2).orElseGet(()->"Ramesh"));	//orElseGet()
        System.out.println(Optional.ofNullable(answer2).orElseThrow(IllegalArgumentException::new));	//orElseThrow()
        
        //lexicographically meaning
        //anagram meaning
        
        
        
	}

}
