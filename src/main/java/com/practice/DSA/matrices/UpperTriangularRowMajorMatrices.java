package com.practice.DSA.matrices;

import java.util.Arrays;
import java.util.Scanner;

class UpperTriangular{
	int n;
	int A[];
	public UpperTriangular(int n) {
		this.n = n;
		n = n* (n+1)/2;
		A = new int[n];
	}
	
	void set(int i, int j, int value) {
		if(i<=j) {
			if(i !=0) {
				i = i-1;
			}
			if(j!=0) {
				j= (j * (j-1)/2) + 1;
			}
			A[i+j] = value;
		}	
	}
	
	int getColumnMajor(int i, int j) {
		Arrays.stream(A).forEach(System.out::println);
		j= j * (j-1)/2;
		i = i-1;
		if(j >= i) {
			return A[i+j];
		}
		return 0;
	}
	
	int get(int i, int j) {
		Arrays.stream(A).forEach(System.out::println);
		i = (i-1) * n - (i-2)*(i-1)/2; 
		j = j-i;
		if(i<=j) {
			return A[i+j];					//M[i][j] != 0; if i>=j
		}
		return 0;
	}
	
	void display(int[][] arr, int it) {
		
		for(int i=0; i<it; i++) {
			for(int j=0; j<it; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


public class UpperTriangularRowMajorMatrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int A[][] = new int[n][n];
		UpperTriangular u = new UpperTriangular(n);
		
		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int temp = sc.nextInt();
				A[i][j] = temp;
				u.set(i, j, temp);
			}
		}
		u.display(A, n);
		System.out.println("Fetch value form Matrice: "+ u.get(2,4));
		u.display(A, n);
	}

}
