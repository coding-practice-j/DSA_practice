package com.practice.DSA.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int A[] = {3,7,9,10,6,5,12,4,11,12,2};
		
		display(bubble(A));

	}
	
	private static void display(int[] A) {
		for(int i : A) {
			System.out.print(i + " ");
		}
		
	}

	private static int[] bubble(int[] A) {
		int flag;
		for(int i=0; i<A.length-1; i++) {
			flag = 0;
			for(int j=0; j<A.length-1-i; j++) {
				int temp = 0;
				if(A[j] > A[j+1]) {
					temp = A[j];
					A[j] =A[j+1];
					A[j+1] = temp;
					flag =1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		return A;
	}

}
