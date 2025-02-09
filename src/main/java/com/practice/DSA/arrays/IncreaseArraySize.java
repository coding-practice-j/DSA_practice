package com.practice.DSA.arrays;

public class IncreaseArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = {5,3,8,6,1};
		System.out.println("Size of p: "+ p.length);
		
		int[] q = new int[10];
		
		for(int i=0; i<p.length; i++) {
			q[i] = p[i];
		}
		
		p = null;			//dereferencing the q from the old array
		p = q;				//Assigning the q to p
		System.out.println("Size of p again: "+ p.length + " and size q: "+q.length);
		
		q = null;
		System.out.println("Q's size: "+ q.length);	//Will throw null pointer exception

	}

}
