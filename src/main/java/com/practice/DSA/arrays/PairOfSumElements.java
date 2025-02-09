package com.practice.DSA.arrays;


public class PairOfSumElements {
	
	void pairOfSum(int []A, int sum) {
		for(int i=0; i<A.length; i++) {
			for(int j = i+1; j<A.length; j++) {
				if(A[i]+A[j] == sum) {
					System.out.println("Pair of sum is: "+ A[i] + ", "+ A[j]);
				}
			}
		}
	}
	
	void pairOfSumUsingHashing(int []A, int sum) {
		int H[] = new int[sum+1];
		for(int i=0; i<A.length; i++) {
			if(A[i] <= sum) {
				if(H[sum-A[i]] != 0) {
					int k = sum-A[i];
					System.out.println("Sum of : " + A[i] + " and " + k +" = "+sum);
				}
				H[A[i]]++;
			}
		}
	}
	
	void pairOfSumSortedArray(int A[], int sum) {
		int i=0, j = A.length-1;
		while(i < j) {
			if(A[i]+A[j] == sum) {
				System.out.println("Sum of sorted array: "+ A[i] +"+"+A[j]+ "= "+sum);
				i++;
				j++;
			}else if(A[i]+A[j] < sum) {
				i++;
			}else {
				j--;
			}
		}
		
	}

	public static void main(String[] args) {

		int A[] = new int[] {6,3,8,10,16,7,5,2,9,14};
		
		//Find pair of sum is 10
		new PairOfSumElements().pairOfSum(A, 10);
		new PairOfSumElements().pairOfSumUsingHashing(A, 10);
		
		int S[] = new int[] {1,3,4,5,6,8,9,10,12,14};
		new PairOfSumElements().pairOfSumSortedArray(S, 10);
		
	}

}
