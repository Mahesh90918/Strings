package com.Strings;

public class reverseString2 {
	public static void main(String[] args) {
		String s = "mahesh";
		String reverse = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
			// reverse +=s.charAt(i); any one used
		}
		System.out.println(reverse);
	}
}
