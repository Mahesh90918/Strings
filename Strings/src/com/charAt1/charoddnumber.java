package com.charAt1;

public class charoddnumber {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		int i = 0;
		System.out.println(".......ODD CHAR.......");
		for (i = 0; i < s.length(); i++) {
			// odd
			if (i % 2 != 0) {
				System.out.println("char at : " + i + " value :" + s.charAt(i));
			}
		}System.out.println("....... EVEN CHAR........");
		for (i = 0; i < s.length(); i++) {
            // even
			if (i % 2 == 0) {
				System.out.println("char at : " + i + " value :" + s.charAt(i));
			}
		}
	}
}