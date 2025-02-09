package com.practice.DSA.recursion;

public class TaylorSeriesUsingRecursion {
	static double p = 1;
	static double f = 1;
	double result = 1;
	
	double exp(int x, int n) {
		if(n == 0) {
			return 1;
		}else {
			result = exp(x, n-1);
			p = p*x;
			f = f*n;
			return result+p/f;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new TaylorSeriesUsingRecursion().exp(1,10));
	}

}
