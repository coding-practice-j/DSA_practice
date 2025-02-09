package com.practice.DSA.recursion;

public class CombinationExample {
	
	int combinationUsingFormula(int n, int r) {
		int t0 = factorial(n);
		int t1 = factorial(r);
		int t2 = factorial(n-r);
		return t0 / (t1 * t2);
	}
	
	int combinationUsingPascalTriangle(int n, int r) {
		if(r == 0 || r == n) {
			return 1;
		}else {
			return combinationUsingPascalTriangle(n-1, r-1) + combinationUsingPascalTriangle(n-1, r);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationExample c = new CombinationExample();
		System.out.println(c.combinationUsingFormula(5, 3));
		System.out.println("Using Pascal Triangle: "+c.combinationUsingPascalTriangle(5, 3));
	}
	
	int factorial(int n) {
		int sum =1;
		for(int i=1; i<=n; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
