package com.practice.DSA.arrays;

public class SortedArray {
	
	int[] insertInSortedArray(int arr[], int key) {
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i+1] == -1) {
				continue;
			}
			if(arr[i+1] > key) {
				arr[i+1] = arr[i];
			}else {
				arr[i+1] = key;
			}
		}
		return arr;
	}
	
	Boolean isSorted(int[] arr, int noOfElements) {
		for(int i=0; i<noOfElements-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int []A = new int[]{4,8,13,16,20,25,28,33,-1,-1};
		
		SortedArray s =new SortedArray();
		
		int[] arr = s.insertInSortedArray(A, 18);
		
		for(int i=0; i<A.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(s.isSorted(new int[] {3,4,6,8,9}, 5));
		
	}

}
