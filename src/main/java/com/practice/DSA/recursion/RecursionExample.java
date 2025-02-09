package com.practice.DSA.recursion;

public class RecursionExample {
	void function1(int x) {
		if (x > 0) {
//			function1(x-1);					//Head Recursion
			System.out.println(x);
			function1(x - 1);				// Tail Recursion
		}
	}
	// Tree Recursion
	void function2(int x) {
		if (x > 0) {
			System.out.print(x + ", ");
			function2(x - 1);
			function2(x - 1);
		}
	}
	//Nested Recursion
	int func(int x) {
		if(x > 100) {
			System.out.println(x);
			return x-10;
		}else
			return func(func(x+11));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		RecursionExample r = new RecursionExample();
		//r.function1(x);
		// r.function2(x);
		// r.A(20);
		// r.func(95);
		System.out.println(r.sum(5));
	}

	// Indirect Recursion: there will be more than one function which will be call each other in circular fashion.
	void A(int n) {
		if (n > 0) {
			System.out.println("A: " + n);
			B(n - 1);
		}
	}
	void B(int n) {
		if (n > 0) {
			System.out.println("B: " + n);
			A(n / 2);
		}
	}
	
	int sum(int n) {
		if(n > 0) {
			return n + sum(n-1);
		}else 
			return 0;
	}
}
