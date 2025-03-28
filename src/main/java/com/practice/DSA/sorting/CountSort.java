package com.practice.DSA.sorting;

public class CountSort {

	public static void main(String[] args) {

		int[] A = {3,3,6,6,6,8,9,10,12,10,13,15};
		
		int max = findMax(A);
		
		int[] C = new int[max+1];
		
		for(int i=0; i< A.length; i++) {
			C[A[i]]++;
		}
		
		//After Sort
		int i=0, j = 0;
		while(i < max+1) {
			if(C[i] > 0) {
				A[j++] = i;
				C[i]--;
			}else {
				i++;
			}
		}
		//Sorted elements
		for (int x : A) {
			System.out.print(x + " ");
		}
	}

	private static int findMax(int []A) {
		int max = 0;
		for(int i : A) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

}
