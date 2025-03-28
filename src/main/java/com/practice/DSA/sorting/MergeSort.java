package com.practice.DSA.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 11, 13, 7, 12, 12, 16, 9, 24, 5, 10, 3, 2 };

		A = iterativeSort(A, A.length - 1);

		for (int i : A) {
			System.out.print(i + " ");
		}

	}

	private static int[] merge(int A[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;

		int B[] = new int[high + 1];

		while (i <= mid && j <= high) {
			if (A[i] < A[j]) {
				B[k++] = A[i++];
			} else {
				B[k++] = A[j++];
			}
		}

		while (i <= mid) {
			B[k++] = A[i++];
		}

		while (j <= high) {
			B[k++] = A[j++];
		}
		return B;
	}

	private static int[] iterativeSort(int[] A, int n) {
		int p;
		for (p = 2; p <= n; p = p * 2) {
			for (int i = 0; i + p - 1 < n; i = i + p) {
				int low = i;
				int high = i + p - 1;
				int mid = (low + high) / 2;
				A =merge(A, low, mid, high);
			}
		}
		if (p / 2 < n) {
			A = merge(A, 0, p / 2 - 1, n - 1);
		}
		return A;
	}
	
	//recusionSort()

}
