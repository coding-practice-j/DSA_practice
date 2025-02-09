package com.practice.DSA.strings;

public class DuplicateString {
	
	void duplicateStrings(String s) {
		char c[] = s.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			int count=1;
			if(c[i] != '\0') {
				for(int j=i+1; j<c.length; j++) {
					if(c[i] == c[j]) {
						count++;
						c[j] = '\0';
					}
				}
				if(count>1)
				System.out.println("character "+ c[i] + " is duplicate: "+ count);
			}
		}
	}
	
	void duplicateStringUsingHashTable(String s) {
		int []H = new int[26];
		char c[] = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			H[c[i]-97]++;
		}
		for(int i=0; i<H.length; i++) {
			if(H[i] > 1) {
				char ch = (char) (97+i);
				System.out.println("char "+ ch +" appeared "+ H[i]);
			}
		}
	}
	
	void duplicateStringUsingBitwise(String s) {
		char c[] = s.toCharArray();
		long H=0, x=0;
		for(int i=0; i<c.length; i++) {
			x=1;
			x = x<<c[i]-97;
			if((x&H) > 0) {
				System.out.println("String is duplicate: "+ c[i]);
			} else /* if((x|H) == 0) */ {
				H = x|H;
			}
		}
	}

	public static void main(String[] args) {
		DuplicateString d = new DuplicateString();
		
		d.duplicateStrings("finding");
		d.duplicateStringUsingHashTable("finding");
		d.duplicateStringUsingBitwise("finding");

	}

}
