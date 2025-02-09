package com.practice.DSA.recursion;

public class SineAndCosineSeries {
	double sinex =0;
	double cosinex = 0;
	
	double sineSeries(double x, int n) {
		int a =1;
		x = x * Math.PI/180;			//Converting degree to radian
		for(int i=1; i<=n; i+=2) {
			int fact = 1;
			for(int j=1; j<=i; j++) {
				fact = fact * j;
			}
			sinex += Math.pow(x, i) / fact * a;
			a *= -1;
		}
		return sinex;
	}
	
	double cosineSeries(double x, int n) {
		int a = 1;
		x = x * Math.PI/180;			//Converting degree to radian
		for(int i=0; i<=n; i+=2) {
			int fact = 1;
			for(int j=1; j<=i; j++) {
				fact = fact * j;
			}
			cosinex += Math.pow(x, i) / fact * a;
			a *= -1;
		}
		return cosinex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SineAndCosineSeries s = new SineAndCosineSeries();
		System.out.println(s.sineSeries(30, 10));
		
		System.out.println(s.cosineSeries(30, 10));

	}

}
