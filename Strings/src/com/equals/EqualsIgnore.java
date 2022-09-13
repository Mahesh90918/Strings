package com.equals;

public class EqualsIgnore {
	public static void main(String[] args) {
		String s1 = "mahesh";
		String s2 = "unukuru";
		String s3 = new String("MAHESH");
		String s4 = new String("UNUKURU");
		// content compare and capital letters no problem
		System.out.println(s1.equalsIgnoreCase(s2));// false,,because content compare
		//true because content and case both are same
		System.out.println(s1.equalsIgnoreCase(s3));// //true because content and case both are same
		System.out.println(s2.equalsIgnoreCase(s4));// //true because content and case both are same
		System.out.println(s2.equalsIgnoreCase("UNUKURU"));// true,, no problem capital letters
		System.out.println(s1.equalsIgnoreCase("MAHESH"));
		System.out.println(s1.equalsIgnoreCase("MaHeSh"));//true

	}
}
