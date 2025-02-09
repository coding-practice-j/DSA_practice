package com.practice.DSA.recursion;

public class FactorialExample {
	
	int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
	int factorialUsingLoop(int n) {
		int sum = 1;
		for(int i = 1; i<=n ;i++) {
			sum =  sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialExample f = new FactorialExample();
		System.out.println(f.factorial(4));
		
		System.out.println(f.factorialUsingLoop(4));
	}

}
