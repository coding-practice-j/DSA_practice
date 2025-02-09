package com.practice.DSA.strings;

public class LowerUpperCaseChanging {

	public static void main(String[] args) {

		String s = "WelComE!";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				s = s.replace(s.charAt(i), (char) (s.charAt(i)+32));
			}else if(s.charAt(i) >=97 && s.charAt(i)<=122) {
				s = s.replace(s.charAt(i), (char) ((char) s.charAt(i)-32));
			}
		}
		System.out.println(s);
		
		s = "WelComE!";
		char[] ch = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i]+32);
			}else if(ch[i] >= 97 && ch[i] <= 120) {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		System.out.println(String.valueOf(ch));
	}

}
