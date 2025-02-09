package com.practice.DSA.matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Diagonal{
	int n;
	int []A;
	public Diagonal(int n) {
		this.n = n;
		A = new int[n];
	}
	void set(int value, int i, int j) {
		if(i==j) {
			A[i] = value;
		}
	}
	
	int get(int i, int j) {
		if(i==j) {
			return A[i];
		}else {
			return 0;
		}
	}
	
	boolean isDiagonal() {
		int count =0;
		for(int a: A){
			if(a > 0) {
				count++;
			}
		}
		if(count == n) {
			return true;
		}
		return false;
		
	}
	
	void display(int A[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print(A[i][j] + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

public class DiagonalMatrice {

	public static void main(String[] args) throws IOException {

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//String str = bf.readLine();
		Scanner sc = new Scanner(System.in);
		
		int it = sc.nextInt();
		
		int [][] A = new int[it][it];
		
		Diagonal d = new Diagonal(it);
		
		System.out.println("Enter matrix value: ");
		for(int i=0; i<it; i++) {
			for(int j=0; j<it; j++) {
				//str = bf.readLine();
				//int temp = Integer.parseInt(bf.readLine());
				int temp = sc.nextInt();
				A[i][j] = temp;
				d.set(temp, i, j);
			}
		}
		System.out.println("get value from matrix: "+ d.get(2, 2));
		d.display(A, it);
		System.out.println("\nIs diagonal: "+ d.isDiagonal());
	}
	
	

}
