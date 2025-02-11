package com.practice.DSA.stack;

import java.util.Scanner;

public class ParanthesisMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String exp = sc.nextLine();

		char[] arr = exp.toCharArray();

		boolean result = isBalanced(arr);
		System.out.println("Is Balanced: "+ result);
	}

	private static boolean isBalanced(char[] arr) {
		StackUsingArray st = new StackUsingArray();
		st.size = arr.length;
		st.top = -1;
		st.A = new int[st.size];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '(' || arr[i] =='{' || arr[i] == '[') {
				StackUsingArrayOperations.push(st, arr[i]);
				
			}else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
				char ch = (char) StackUsingArrayOperations.pop(st);
				if(arr[i] == ')' && ch == '(') {
					continue;
				}else if(arr[i] == '}' && ch == '{') {
					continue;
				}else if(arr[i] == ']' && ch == '[') {
					continue;
				}else {
					return false;
				}
			}
		}
		return StackUsingArrayOperations.isEmpty(st)? true : false;
	}

}
