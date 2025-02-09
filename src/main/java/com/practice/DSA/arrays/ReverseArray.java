package com.practice.DSA.arrays;

public class ReverseArray {
	
	int[] reverseArrayUsingLoop(int arr[]){
		int len = arr.length;
		int arr1[] = new int[arr.length];
		for(int i=len-1, j=0; i>=0; i--, j++) {
			arr1[j] = arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr1[i];
		}
		arr1 = null;
		return arr;
	}
	
	int[] reverArrayUsingDivideAndConquer(int arr[]) {
		int temp = 0;
		for(int i=0,j=arr.length-1; i<j; i++,j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[]{3,8,12,95,36,8,2,1,5,4,33};
		System.out.println(A.length);
		
		ReverseArray r = new ReverseArray();
		int arr[] = r.reverseArrayUsingLoop(A);
		
		System.out.println("Reverse: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nAgain Reverse: ");
		arr = r.reverArrayUsingDivideAndConquer(arr);
		for(int i=0; i<A.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
