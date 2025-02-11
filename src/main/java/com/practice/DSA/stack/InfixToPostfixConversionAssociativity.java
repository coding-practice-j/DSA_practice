package com.practice.DSA.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InfixToPostfixConversionAssociativity {

	public static void main(String[] args) {
		String s = "a+b*(c^d-e)^(f+g*h)-i";
		char[] ch = convert(s);

		for (char c : ch) {
			System.out.print(c);
		}

		s = "((a+b)*c)-d^e^f";
		ch = convert(s);
		System.out.println("\nAnother String: ");
		for (char c : ch) {
			System.out.print(c);
		}
		s = "2 3 1 * + 9 -";
		int output = evaluate(s);
		System.out.println("\nEvaluate the result: " + output);
		s = "100 200 + 2 / 5 * 7 +";
		System.out.println("\nEvaluate the result: " + evaluate(s));
	}

	private static int evaluate(String s) {
		Stack<Integer> st = new Stack<>();
		String[] str = s.split(" ");
 		int x;
		int i = 0;
		List<String> l = new ArrayList<>(Arrays.asList("+", "-", "/", "*", "^"));
		while (i < str.length) {
			if(!l.contains(str[i])) {
				x = Integer.parseInt(str[i]);
				st.push(x);
				i++;
			}else {
				int exp2 = st.pop();
				int exp1 = st.pop();
				switch (str[i]) {
				case "+":
					st.push(exp1 + exp2);
					break;
				case "-":
					st.push(exp1 - exp2);
					break;
				case "*":
					st.push(exp1 * exp2);
					break;
				case "/":
					st.push(exp1 / exp2);
					break;
				case "^":
					st.push((int) Math.pow(exp1, exp2));
					break;
				}
				i++;
			}
		}
		return st.pop();
	}

	private static char[] convert(String s) {
		Stack<Character> st = new Stack<>();
		char[] postfix = new char[s.length()];
		char[] ch = s.toCharArray();
		int j = 0;

		for (int i = 0; i < ch.length;) {
			if (isOperand(ch[i])) {
				postfix[j] = ch[i];
				i++;
				j++;
			} else {
				if (st.empty() || (outPrecedence(ch[i]) > inPrecedence(st.peek().charValue()))) {
					st.push(ch[i]);
					i++;
				} else if (outPrecedence(ch[i]) == inPrecedence(st.peek())) {
					st.pop();
					i++;
				} else {
					postfix[j] = st.pop();
					j++;
				}
			}
		}
		// Taking out every operator from the stack and appending with the result.
		while (!st.empty() && st.peek() != ')') {
			postfix[j] = st.pop();
			j++;
		}
		return postfix;
	}

	private static boolean isOperand(char ch) {
		List<Character> l = new ArrayList<>(Arrays.asList('+', '-', '/', '*', '(', ')', '^'));
		if (l.contains(ch)) {
			return false;
		} else {
			return true;
		}
	}

	private static int outPrecedence(char ch) {
		switch (ch) {
		case '+', '-':
			return 1;
		case '*', '/':
			return 3;
		case '^':
			return 6;
		case '(':
			return 7;
		case ')':
			return 0;
		default:
			return -1;
		}
	}

	private static int inPrecedence(char ch) {
		switch (ch) {
		case '+', '-':
			return 2;
		case '*', '/':
			return 4;
		case '^':
			return 5;
		case '(', ')':
			return 0;
		default:
			return -1;
		}
	}

}
