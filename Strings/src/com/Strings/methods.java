package com.Strings;

public class methods {
	public static void main(String[] args) {
		String s1 = "mahesh";
		String s2 = "mahesh";
		// its means s3 and s4 references stores in Heap memory
		String s3 = new String("mahesh");
		String s4 = new String("mahesh");
		// its means s1 and s2 content stores in string constant pool
		System.out.println(s1 == s2);// TRUE
		// its means s3 and s4 references stores in Heap memory
		// but content stores in string constant pool
		System.out.println(s3 == s4);// FALSE new keyword stores HEAP memory
		// this method is " s3" is stores in Heap but
		// when you you "intern" "S3" stores in String constant pool
		// main thing content is same like "mahesh"
		s3 = s3.intern();// reference s3 stores in SCP
		System.out.println(s3 == s1);
		System.out.println(s3.equals(s2));
		System.out.println(s3 == s2);
		s4 = s4.intern();// reference s4 stores in SCP
		System.out.println(s4 == s2);
		System.out.println(s4 == s3);
		String s5 = "mahesh";
		String s8 = "MAHESH";
		String s6 = new String("mahesh");
		String s7 = "unukuru";
		System.out.println(s5.equals(s6));// true,,,content same
		System.out.println(s5.equals(s7));// false,,, content different
		System.out.println(s5.equals(s8));//false
		// false ,,content same but CAPITAL letters different
		System.out.println(s5.equalsIgnoreCase(s8));//true
		// true content same no problem either its is small letters or capital letters

	}
}
