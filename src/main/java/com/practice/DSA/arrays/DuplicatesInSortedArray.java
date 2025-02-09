package com.practice.DSA.arrays;

public class DuplicatesInSortedArray {
	
	void duplicateElements(int arr[]) {
		int lastDuplicate = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1] && arr[i] != lastDuplicate) {
				System.out.println(arr[i]);
				lastDuplicate = arr[i];
			}
		}
	}
	
	void countDuplicates(int []arr) {
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				j = i+1;
				while(arr[i] == arr[j]) {
					j++;
				}
				int count = j-i;
				System.out.println(arr[i]+" duplicates count is: "+ count);
				i = j-1;
			}
		}
	}
	
	void duplicateCountsUsingHashtable(int arr[]) {
		BasicOperationsArrays b = new BasicOperationsArrays();
		int min = b.min(arr);
		int max = b.max(arr);
		
		int A[] =  new int[max+1];
		for(int i=0; i<arr.length; i++) {
			A[arr[i]]++;
		}
		for(int i=0; i<max+1; i++) {
			if(A[i] > 1) {
				System.out.println(i + " appears " + A[i] + " times");
			}
		}
	}

	public static void main(String[] args) {

		int A[] = new int[] {3,6,8,8,10,12,15,15,15,20};
		DuplicatesInSortedArray d = new DuplicatesInSortedArray();
		d.duplicateElements(A);
		d.countDuplicates(A);
		d.duplicateCountsUsingHashtable(A);
	}

}
