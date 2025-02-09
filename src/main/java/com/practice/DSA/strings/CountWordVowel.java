package com.practice.DSA.strings;

public class CountWordVowel {
	
	boolean validateString(String s) {
		for(char c: s.toCharArray()) {
			if(!(c >=65 && c<=90) && !(c>=97 && c<=120) && !(c>=47 && c<=56)) {
				return false;
			}
		}
		return true;
	}
	
	String reverseString(String s) {
		char[] c = s.toCharArray();
		char[] ch = new char[c.length];
		int k=0;
		for(int i=c.length-1; i>=0; i--) {
			ch[k] = c[i];
			k++;
		}
		return String.valueOf(ch);
	}
	
	String reverseStringInSingleArray(String s) {
		char[] c = s.toCharArray();
		char temp;
		int j=0;
		for(int i=c.length-1; i>j; i--) {
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;;
			j++;
		}
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		String s = "How are you?";
		int vcount = 0, ccount =0;
		for(char c : s.toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vcount++;
			}else if((c >=65 && c<=90) || (c>=97 && c<=120)){
				ccount++;
			}
		}
		System.out.println("Total count of vowel and consonant is: "+vcount+ " and "+ ccount);
		
		String[] words = s.split(" ");
		System.out.println("Total words are present: "+words.length);
		
		System.out.println(new CountWordVowel().validateString("Sakshi"));
		
		System.out.println("reverse string: "+ new CountWordVowel().reverseString("Hello Baby!"));
		System.out.println("reverse string single array: "+ new CountWordVowel().reverseStringInSingleArray("Hello Baby!"));
		
		String str = "madam";
		System.out.println("String is Palindrome: "+new CountWordVowel().reverseStringInSingleArray(str).equals(str));
	
	}
	
}
