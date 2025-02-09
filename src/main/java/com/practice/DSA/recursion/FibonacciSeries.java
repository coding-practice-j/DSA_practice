package com.practice.DSA.recursion;

public class FibonacciSeries {
	
	int fibonacciUsingRecursion(int n) {
		if(n > 1) {
			return fibonacciUsingRecursion(n-2) + fibonacciUsingRecursion(n-1);
		}else {
			return n;
		}
	}
	
	int  fibonacciUsingLoop(int n) {
		int t0 = 0; int t1 = 1;
		int sum = 0;
		for(int i = 2; i<=n; i++) {
			sum = t0 + t1;
			t0 = t1;
			t1 = sum;
		}
		return sum;
	}
	
	int fibnacciUsingMemoization(int n) {
		int F[] = new int[n+1];
//		System.out.println(F[0]);
		if(n <= 1) {
			F[n] = n;
			return n;
		}else {
			if(F[n-1] == 0) {
				F[n-1] = fibnacciUsingMemoization(n-1);
			}
			if(F[n-2] == 0) {
				F[n-2] = fibnacciUsingMemoization(n-2);
			}
			return F[n-2]+F[n-1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries f = new FibonacciSeries();
		System.out.println(f.fibonacciUsingRecursion(7));
		
		System.out.println("Using loop:: "+f.fibonacciUsingLoop(7));
		System.out.println("Using Memoization:: "+f.fibnacciUsingMemoization(7));

	}

}
