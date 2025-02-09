package com.practice.DSA.strings;

public class AnagramString {
	
	boolean isAnagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int[] H = new int[25];
		
		for(int i=0; i<c1.length; i++) {
			H[c1[i]-97] +=1;
		}
		
		for(int i=0; i<c2.length; i++) {
			H[c2[i]-97] -=1;
			if(H[c2[i]-97] < 0) {
				System.out.println("String is not an anagram");
				return false;
			}
		}
		System.out.println("String is an anagram");
		return true;
	}

	public static void main(String[] args) {

		new AnagramString().isAnagram("decimal", "medical");
		new AnagramString().isAnagram("verbose", "observe");
	}

}
