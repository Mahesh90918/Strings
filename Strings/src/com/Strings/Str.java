package com.Strings;

public class Str {
public static void main(String[] args) {
	

	
	
	String str="uday";

		String str2 = "uday";
		String str3 = new String("uday");
		///
		String s5 = str3.intern();
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str == str3.intern());
		System.out.println(str2.equals(str3));
	
}
}
