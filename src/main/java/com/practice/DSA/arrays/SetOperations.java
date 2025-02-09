package com.practice.DSA.arrays;

public class SetOperations {
	
	int[] union(int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		int[] C = new int[m+n];
		int k=0; 
		for(int i=0; i<m; i++) {		//Inserting 1st array elements in the 3rd array
			C[k] = A[i];
			k++;
		}
		for(int j=0; j<n; j++) {			//Insert 2nd array elements in the 3rd array if there is no duplicate entries
			boolean flag = false;
			for(int i=0; i<m+n; i++) {	//To check the duplicate entry is present or not
				if(C[i] == B[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) { C[k] = B[j]; k++; }	
		}
		return C;
	}
	
	int[] intersection(int[] A, int[] B) {
		int C[] = new int[A.length];
		int k=0;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B.length; j++) {
				if(A[i] == B[j]) {
					C[k] = A[i];
					k++;
				}
			}
		}
		return C;
	}
	
	int[] differences(int[] A, int[] B) {
		int[] C = new int[A.length];
		int k=0; 
		for(int i=0; i<A.length; i++) {
			boolean flag = true;
			for(int j=0; j<B.length; j++) {
				if(A[i] == B[j]) {
					flag = false;
				}
			}
			if(flag) {			//in case of set only flag will value will be change
				C[k] = A[i];
				k++;
			}
		}
		return C;
	}
	
	int[] set(int[] A, int[] B) {
		int[] C = new int[A.length];
		int k=0; 
		for(int i=0; i<A.length; i++) {
			boolean flag = false;
			for(int j=0; j<B.length; j++) {
				if(A[i] == B[j]) {
					flag = true;
				}
			}
			if(flag) {			//in case of set only flag will value will be change
				C[k] = A[i];
				k++;
			}
		}
		return C;
	}

	public static void main(String[] args) {

		SetOperations s = new SetOperations();
		int[] A = new int[] {3,5,10,4,6};
		int[] B = new int[] {12,4,7,2,5};
		
		//int []finalArr = s.union(A, B);
		//int []finalArr = s.intersection(A, B);
		//int[] finalArr =  s.differences(A, B);
		int[] finalArr =  s.set(A, B);
		for(int i=0; i<finalArr.length; i++) {
			System.out.println(finalArr[i]);
		}
	}

}
