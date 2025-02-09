package com.practice.DSA.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElementInArray {

	int sequentialArrayStartsWith1(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int n = arr[arr.length - 1];
		int sumOfN = n * (n + 1) / 2; // If an array starts from 1.
		return sumOfN - sum;
	}

	int sequentialArrayStartsWithN(int[] arr) {
		int diff = arr[0] - 0;
		for (int i = 1; i < arr.length; i++) {
			if (diff != arr[i] - i) {
				return i + diff; // If an array starts from any number
			}
		}
		return diff;
	}

	List<Integer> multipleMissingNumberFromSortedArray(int[] arr) {
		List<Integer> l = new ArrayList<>();
		int diff = arr[0] - 0;
		for (int i = 1; i < arr.length; i++) {
			if (diff != arr[i] - i) {
				while (diff < arr[i] - i) {
					l.add(diff + i);
					diff++;
				}
			}
		}
		return l;
	}

	void multipleMissingNumberFromUnSortedArray(int[] arr) {
		BasicOperationsArrays b = new BasicOperationsArrays();
		int min= b.min(arr);
		int max = b.max(arr)+1;
		int len = arr.length;
		int []A = new int[max];			//Created a new array at the max element of the length
		
		for(int i=0; i<len; i++) {		//Incrementing by 1 at index position of the new array
			A[arr[i]]++;
		}
		System.out.println("Missing element from an unsorted array:: ");
		for(; min<max; min++) {		//Duplicate entry index
			if(A[min] == 0) {
				System.out.println(min);
			}
		}
		
	}

	public static void main(String[] args) {

		FindMissingElementInArray f = new FindMissingElementInArray();
		// find single missing number for n naturals number starting from 1
		int[] A = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		System.out.println(f.sequentialArrayStartsWith1(A));

		// find single missing number for n naturals number starting from any number
		int[] B = new int[] { 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17 };
		System.out.println(f.sequentialArrayStartsWithN(B));

		// find multiple missing number from n natural number start from 1
		int[] A1 = new int[] { 6, 7, 8, 9, 11, 12, 15, 16, 17, 19 };
		System.out.println(f.multipleMissingNumberFromSortedArray(A1));
		
		//find multiple missing number from an unsorted array
		int B1[] = new int[] {3,7,4,9,12,6,1,11,2,10};
		f.multipleMissingNumberFromUnSortedArray(B1);

	}

}
