package com.practice.DSA.matrices;

import java.util.Scanner;

class RowMajor{
	int n;
	int A[];
	public RowMajor(int n) {
		this.n = n;
		n = n* (n+1)/2;
		A = new int[n];
	}
	
	void set(int i, int j, int value) {
		if(i>=j) {
			if(i!=0) {
				i = i * (i-1)/2; 
			}
			if(j != 0) {
				j = j-1;
			}
			A[i+j] = value;
		}
	}
	
	int get(int i, int j) {
		i = i * (i-1)/2; 
		j = j-1;
		if(i>=j) {
			return A[i+j];					//M[i][j] != 0; if i>=j
		}
		return 0;	
	}
	
	int getColumnMajor(int i, int j) {
		i = (j-1) * n - (j-2)*(j-1)/2 + i-j; 
		j = j-1;
		if(i>=j) {
			return A[i+j];					//M[i][j] != 0; if i>=j
		}
		return 0;	
	}
	
	void display(int arr[][], int it) {
		for(int i=0; i<it; i++) {
			for(int j=0; j<it; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class LowerTriangularRowMajorMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		int n = sc.nextInt();
		
		int A[][] = new int[n][n];
		RowMajor r = new RowMajor(n);
		
		System.out.println("Enter Values: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int temp = sc.nextInt();
				A[i][j] = temp;
				r.set(i, j, temp);
			}
		}
		System.out.println("Fetch value form Matrice: "+ r.get(3,2));
		r.display(A, n);
	}

}
