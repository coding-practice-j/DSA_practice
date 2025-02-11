package com.practice.DSA.stack;

import java.util.Scanner;

public class InfixToPostfixConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String exp = sc.nextLine();					// Input:  a+b*c-d/e

		char[] infix = exp.toCharArray();
		
		char[] postfix = convert(infix);
		System.out.println(postfix.length);
		for(char ch : postfix) {
			System.out.print(ch);
		}
	}
	
	private static char[] convert(char[] infix) {
		StackUsingArray st = new StackUsingArray();
		int len = infix.length;
		st.size = len;
		st.top = -1;
		st.A = new int[len];
		
		char[] postfix = new char[len+1];
		int i=0; int j=0;
		
		while(i < len) {
			if(isOperand(infix[i])) {
				postfix[j++] = infix[i++];
			}else {
				if(precedence(infix[i]) > precedence((char)StackUsingArrayOperations.stackTop(st))) {
					StackUsingArrayOperations.push(st, infix[i++]);
				}else {
					postfix[j++] = (char) StackUsingArrayOperations.pop(st);
				}
			}
		}
		
		while(!StackUsingArrayOperations.isEmpty(st)) {
			postfix[j++] = (char) StackUsingArrayOperations.pop(st);
		}
		return postfix;					// Output: abc*+de/-
	}

	private static boolean isOperand(char ch) {
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
			return false;
		}else {
			return true;
		}
	}
	
	private static int precedence(char ch) {
		if(ch == '+' || ch == '-') {
			return 1;
		}else if(ch == '*' || ch == '/') {
			return 2;
		}
		return 0;
	}

}
