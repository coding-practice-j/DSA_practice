package com.practice.DSA.arrays;

public class NegativeOnLeftArray {
	
	int[] negativeOnLeft(int []arr) {
		for(int i=0, j=arr.length-1; i<j; ) {
			int temp = 0;
			if(arr[i] < 0) {
				i++;
			}else if(arr[j] >= 0) {
				j--;
			}else{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		NegativeOnLeftArray n = new NegativeOnLeftArray();
		int arr[] = new int[] {-6,4,2,3,1,8,-4,9,-2,-7,-3};
		int[] A = n.negativeOnLeft(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(A[i]);
		}
	}

}
