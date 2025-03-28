package com.practice.DSA.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] A = { 3, 7, 9, 10, 6, 5, 12, 4, 11, 12, 13, 0 };

		display(insert(A));

	}

	private static int[] insert(int[] A) {
		int x;
		for (int i = 1; i < A.length; i++) {
			int j = i - 1;
			x = A[i];
			while (j > -1 && A[j] > x) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = x;
		}
		return A;
	}

	private static void display(int[] A) {
		for (int i : A) {
			System.out.print(i + " ");
		}

	}

}
