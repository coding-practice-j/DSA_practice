package com.practice.DSA.arrays;

public class DuplicatesUnsortedArray {
	
	void duplicateElements(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int count = 1;
			if(arr[i] != -1) {
				for(int j=i+1; j<arr.length-1; j++) {
					if(arr[i] == arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				if(count>1)
				System.out.println(arr[i] + " is appearing "+ count + " times.");
			}
		}
	}

	void duplicatesUsingHashTable(int arr[]) {
		BasicOperationsArrays b = new BasicOperationsArrays();
		int min = b.min(arr);
		int max = b.max(arr);
		int A[] = new int[max+1];
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			A[val]++;
		}
		for(int i=0; i<A.length; i++) {
			if(A[i] > 1) {
				System.out.println(i + " total counts of:: "+A[i]);
			}
		}
	}
	
	public static void main(String[] args) {

		int A[] = new int[] {8,3,6,4,6,5,6,8,2,7};
		DuplicatesUnsortedArray d = new DuplicatesUnsortedArray();
		d.duplicatesUsingHashTable(A);
		d.duplicateElements(A);
		
	}

}
