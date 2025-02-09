package com.practice.DSA.arrays;

public class ShiftAndRotateArrayElements {
	
	int[] shiftRight(int []arr) {
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = 0;
		return arr;
	}
	int[] shiftLeft(int []arr) {
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return arr;
	}
	
	int[] rotateRight(int []arr) {
		int tempVal = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = tempVal;
		return arr;
	}
	int[] rotateLeft(int []arr) {
		int tempVal = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tempVal;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{12,20,42,32,67,43,51,60,40,30};
		ShiftAndRotateArrayElements s = new ShiftAndRotateArrayElements();
		int []temp = s.shiftRight(A);
		//int []temp = s.shiftLeft(A);
		for(int i=0; i<A.length; i++) {
			System.out.println(temp[i]);
		}
		
		int[] A1 = new int[]{12,20,42,32,67,43,51,60,40,30};
		System.out.println("rotating elements: ");
		//int A2[] = s.rotateRight(A1);
		int[] A2 = s.rotateLeft(A1);
		for(int i=0; i<A1.length; i++) {
			System.out.print(A2[i] + " ");
		}
	}

}
