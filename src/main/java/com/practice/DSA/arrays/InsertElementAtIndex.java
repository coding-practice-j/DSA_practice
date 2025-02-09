package com.practice.DSA.arrays;

import java.util.Arrays;

public class InsertElementAtIndex {
	
	int arr[] = new int[10];
	
	void insert(int index, int value) {
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		arr[0] = 10;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 9;
		System.out.print("Before insert: " + arr.length + ":: ");
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		for(int i=arr.length-1; i>index; i--) {
			arr[i] = arr[i-1];
			if(index == i-1) {
				arr[i-1] = value;
				break;
			}
		}
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertElementAtIndex().insert(1, 15);

	}

}
