package com.practice.DSA.strings;

public class PermutationOfString {
	
	static int A[] =  new int[10];
	static char[] res = new char[10];
	
	void permutation(String str, int start, int end) {
		int i;
		if(start == end-1) {
			System.out.println(str);
		}else {
			for(i=start; i<str.length(); i++) {
				str = swapString(str, start, i);
				permutation(str, start+1, end);
				str = swapString(str, start, i);
			}
		}
	}
	
	private String swapString(String s, int i, int j) {
		 char[] b =s.toCharArray();    
	        char ch;    
	        ch = b[i];    
	        b[i] = b[j];    
	        b[j] = ch;    
	        return String.valueOf(b); 
	}
	
	void permutationUsingSubstring(String prefix, String str) {
		int n = str.length();
		if(n == 0) {
			System.out.println(prefix);
		}else {
			for(int i=0; i<n; i++) {
				permutationUsingSubstring(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1,n));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new PermutationOfString().permutation("ABC", 0, 3);
		
		new PermutationOfString().permutationUsingSubstring("", "ABC");
		
		//System.out.println("Nothing printed   "+"ABC".substring(0,0));
		//System.out.println("Nothing printed   "+"ABC".substring(3,3));

	}

}
