package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReductionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> names = Arrays.asList("Ravi", "Sita", "Arjun", "Lakshmi", "Rahul");

        // Sum using reduce method
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Sum using Collectors.summingInt
        int sumCollector = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum (Collectors): " + sumCollector);

        // Find maximum value
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        max.ifPresent(value -> System.out.println("Max: " + value));

        // Find minimum value
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        min.ifPresent(value -> System.out.println("Min: " + value));

        // Concatenate strings using reduce method
        String concatenatedString = names.stream().reduce("", (partialString, element) -> partialString + element);
        System.out.println("Concatenated String: " + concatenatedString);

        // Concatenate strings using Collectors.joining
        String concatenatedStringCollector = names.stream().collect(Collectors.joining(", "));
        System.out.println("Concatenated String (Collectors): " + concatenatedStringCollector);

        // Calculate product using reduce method
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
    }
}