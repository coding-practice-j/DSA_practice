package com.practice.DSA.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {11,13,7,12,16,9,24,5,10,3, 3};
		
		display(selection(A));

	}

	private static int[] selection(int[] A) {
		
		for(int i=0; i< A.length; i++) {
			int k =i;
			for(int j=i; j< A.length; j++) {
				if(A[j] < A[k]) {
					k = j;
				}
			}
			//swap
			int temp = A[i];
			A[i] = A[k];
			A[k] = temp;
		}
		return A;
	}
	
	private static void display(int[] A) {
		for (int i : A) {
			System.out.print(i + " ");
		}

	}

}
