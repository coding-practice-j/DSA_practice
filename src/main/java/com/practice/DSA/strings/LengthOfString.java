package com.practice.DSA.strings;

public class LengthOfString {

	public static void main(String[] args) {

		int length = 0;
		String s = "TestString";
		for(char c : s.toCharArray()) {
			length++;
		}
		System.out.println(length);
		
		s = s+'\0';
		int i=0;
		while(s.charAt(i) !='\0') {
			i++;
		}
		System.out.println("String length is: "+i);
	}

}
