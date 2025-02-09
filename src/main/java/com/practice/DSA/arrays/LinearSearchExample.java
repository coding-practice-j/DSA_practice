package com.practice.DSA.arrays;

public class LinearSearchExample {
	
	int linearSearch(int arr[], int value) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	//In every search shifting the value of the key to one index before
	int linearSearchUsingTransposition(int arr[], int value) { 
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == value) {
				//swap(arr[i], arr[i-1]);
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
				return i;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{4,8,1,5,0,5,3,12};
		LinearSearchExample l =new LinearSearchExample();
		System.out.println(l.linearSearchUsingTransposition(a, 3));
		System.out.println(l.linearSearch(a, 3));
	}

}
