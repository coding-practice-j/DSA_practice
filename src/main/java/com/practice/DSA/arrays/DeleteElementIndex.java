package com.practice.DSA.arrays;

public class DeleteElementIndex {
	
	void display(int []a) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	void delete(int[] a, int index) {
		try {
			for(int i=index; i<a.length; i++) {
				a[i] = a[i+1];
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Length of an array: "+ a.length);
			display(a);
		}
	}

	public static void main(String[] args) {
		int n[] = new int[10];
		n[0] = 8;
		n[1] = 4;
		n[2] = 9;
		n[3] = 1;
		n[4] = 3;
		n[5] = 10;
		new DeleteElementIndex().delete(n, 2);
	}

}
