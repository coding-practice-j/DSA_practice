package com.practice.DSA.recursion;

public class TaylorSeriesUsingHornerRule {
	
	double exp(int x, int n) {
		double result = 1;
		for(; n>0; n--) {
			result = 1 + (result * x/n);
		}
		return result;
	}
	static double result;
	double expUsingRecursionConcept(int x, int n) {
		if(n>0) {
			result = 1 + (result * x/n);
			return expUsingRecursionConcept(x, n-1);
		}else {
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new TaylorSeriesUsingHornerRule().exp(1,10));
		System.out.println(new TaylorSeriesUsingHornerRule().expUsingRecursionConcept(1,10));
	}

}
