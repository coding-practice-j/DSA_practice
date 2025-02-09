package com.practice.DSA.arrays;

public class MergingArrays {
	
	int[] mergeArrays(int[] A1, int[] A2) {		//Merging sorted array in a new sorted array
		int m = A1.length;
		int n = A2.length;
		int[] A3 = new int[m+n];
		
		int i=0, j=0;
		for(int k=0; k<A3.length; k++){
			if(i<m && j<n) {
				if(A1[i] < A2[j]) {
					A3[k] = A1[i];
					i++;
				}else {
					A3[k] = A2[j];
					j++;
				}
			}else {
				if(i<m) {
					A3[k] = A1[i];
					i++;
				}
				if(i < n) {
					A3[k] = A2[j];
					j++;
				}
			}
		}
		return A3;
	}

	public static void main(String[] args) {

		int[] A1 = new int[] {3,5,7,9,11};
		int[] A2 = new int[] {2,4,6,8,10};
		MergingArrays m = new MergingArrays();
		int[] finalArray = m.mergeArrays(A1, A2);
		for(int i=0; i<finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}
		
	}

}
