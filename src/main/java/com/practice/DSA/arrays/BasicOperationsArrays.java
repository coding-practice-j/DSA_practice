package com.practice.DSA.arrays;

public class BasicOperationsArrays {
	
	int get(int arr[], int index) {
		if(index > 0 && index < arr.length)
			return arr[index];
		return -1;
	}
	
	int set(int arr[], int index, int key) {
		if(index > 0 && index < arr.length) {
			arr[index] = key;
			return arr[index];
		}
		return -1;
	}
	
	int max(int arr[]) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	int min(int arr[]) {
		int min = 999;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	int sum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	double avg(int arr[]) {
		return (double)sum(arr)/arr.length;
	}

	public static void main(String[] args) {
		int arr[] =  new int[] {23, 65, 12, 89, 32, 65, 99};
		BasicOperationsArrays obj = new BasicOperationsArrays();
		System.out.println("Get Operation: "+obj.get(arr, 4));
		System.out.println("Set Operation: "+obj.set(arr, 4, 2));
		System.out.println("Max Operation: "+obj.max(arr));
		System.out.println("Min Operation: "+obj.min(arr));
		System.out.println("Sum Operation: "+obj.sum(arr));
		System.out.println("Avg Operation: "+obj.avg(arr));
	}

}
