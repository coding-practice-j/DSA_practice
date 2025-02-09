package com.practice.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Person> predicate = (person) -> person.getAge() > 28;
        boolean result = predicate.test(new Person("ramesh", 29));
        System.out.println(result);
        
        // Function functional interface example
     // convert centigrade to fahrenheit
        Function< Integer, Double > centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);

        // String to an integer
        Function < String, Integer > stringToInt = x -> Integer.valueOf(x);
        System.out.println(" String to Int: " + stringToInt.apply("4"));


        Function < PersonEntity, Person > function = (entity) -> {
            return new Person(entity.getName(), entity.getAge());
        };
        Person personDTO = function.apply(new PersonEntity("ramesh", 20));
        System.out.println(personDTO.getName());
        System.out.println(personDTO.getAge());
        
        //Supplier Functional Interface Example
        Supplier<Person> supplier = () -> { 
            return new Person("Ramesh", 30 );
        };
   
        Person p = supplier.get();
        System.out.println("Person Detail: " + p.getName() + ", " + p.getAge());
        
        //Consumer Functional Interface Example
        Consumer<Person> consumer = (person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
         };
         consumer.accept(new Person("Ramesh", 30));

	}

}
