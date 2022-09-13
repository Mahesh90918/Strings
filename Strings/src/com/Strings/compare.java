package com.Strings;

public class compare {
public static void main(String[] args) {
	//ASCII comparison like 
	String s1="mahesh";
	String s2="mahesh";
	String s3="mah";
	
	System.out.println(s1.compareTo(s2));//0
	System.out.println(s1.compareTo(s3));//3  (s1>s3) positive
	System.out.println(s3.compareTo(s1));//-3 ( s3<s1) negative
	String s4="hello";  
	String s5="hello";  
	String s6="meklo";  
	String s7="hemlo";  
	String s8="flag";  
	System.out.println(s4.compareTo(s5));//0 because both are equal  
	System.out.println(s4.compareTo(s6));//-5 because "h" is 5 times lower than "m"  
	System.out.println(s4.compareTo(s7));//-1 because "l" is 1 times lower than "m"  
	System.out.println(s4.compareTo(s8));//2 because "h" is 2 times greater than "f"  

	//ASCII value finding
		char c='m';//109 ASCII code of m
		char ch='u';//117 ASCII code of u
		System.out.println((int)c);
		System.out.println((int)ch);
		String s10="unukuru";
		System.out.println(s10.compareTo(s1));//m-u=117-109= 8
		System.out.println(s1.compareTo(s10));//u-m=109-117= -8
}
}
