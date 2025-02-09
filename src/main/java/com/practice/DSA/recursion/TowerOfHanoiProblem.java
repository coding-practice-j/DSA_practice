package com.practice.DSA.recursion;

public class TowerOfHanoiProblem {
	
	/*
	 * N - Number of Disks 
	 * A,B,C - Tower name
	 */
	void TOH(int N, char A, char B, char C) {
		if(N > 0) {
			TOH(N-1, A, C, B);
			System.out.println("Move disk form "+ A + " to " + C);
			TOH(N-1, B, A, C);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TowerOfHanoiProblem().TOH(3, 'A', 'B', 'C');

	}

}
