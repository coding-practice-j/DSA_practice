package com.practice.DSA.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {11,13,7,12,12,16,9,24,5,10,3,2};
		
		sort(A, 0, A.length-1);
		
		for (int i : A) {
			System.out.print(i + " ");
		}

	}

	private static int partition(int[] A, int low, int high) {
		int pivot = A[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (A[j] <= pivot)
            {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[high];
        A[high] = temp;

        return i+1;
	}

	private static void sort(int[] A, int l, int h) {
		int j;
		if(l < h) {
			j = partition(A, l, h);
			sort(A, l, j-1);
			sort(A, j+1, h);
		}
		//return A;
	}

}
