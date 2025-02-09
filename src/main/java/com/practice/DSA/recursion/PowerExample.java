package com.practice.DSA.recursion;

public class PowerExample {
	
	int power(int base, int pow){
		if(pow > 0) {
			return base * power(base, pow-1);
		}else {
			return 1;
		}
	}
	
	public double myPow(double x, int n) {
		System.out.println(Math.round(0));
        if(x > -100.0 || x < 100.0){
            if(n == 0){
                return 1.0;
            }else if(n < 0) {
            	return 1/x * myPow(x, n+1);
            } else{
                return x * myPow(x, n-1);
            }
        }
        return 1.0;
    }
	
	double pow1(double x, int n) {
		if(n==0) {
			return 1;
		}
		double halfAns = pow1(x, n/2);
		if(n % 2 ==0) {
			return halfAns * halfAns;
		}else {
			return x * halfAns * halfAns;
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new PowerExample().power(5, 3));
		
		//System.out.println(new PowerExample().myPow(0.00001, 2147483647));
		double x=2;
		int n = -2;
		
		if(n<0) {
			x=1/x;
			n=-1*n;
		}
		
		System.out.println(new PowerExample().pow1(x, n));

	}

}
