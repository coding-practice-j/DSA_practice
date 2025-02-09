package com.practice.DSA.arrays;

//In Binary Search, the prerequisite is array must always be sorted
public class BinarySearchExample {

	int binarySearch(int l, int h, int key, int arr[]) {
		int m = 0;
		while(l<=h) {
			m = (l+h)/2;
			if(key < arr[m]) {
				h = h-1;
			}else if(key > arr[m]){
				l = l+1;
			}else {
				return m;
			}
		}
		return -1;
	}
	int m = 0;
	int binarySearchUsingRecursion(int l, int h, int key, int arr[]) {
		m = (l+h)/2;
		if(l>h) {
			return -1;
		}
		if(key < arr[m]) {
			return binarySearchUsingRecursion(l, h-1, key, arr);
		}else if(key > arr[m]){
			return binarySearchUsingRecursion(l+1, h, key, arr);
		}else {
			return m;
		}
		
	}
	
	public static void main(String[] args) {

		int arr[] = new int[] {10,15,20,25,30,35,40,45,50,55,60};
		System.out.println("Length of the array:: "+ arr.length);
		System.out.println(new BinarySearchExample().binarySearch(0, 10, 60, arr));
		System.out.println(new BinarySearchExample().binarySearchUsingRecursion(0, 10, 25, arr));
	}

}
