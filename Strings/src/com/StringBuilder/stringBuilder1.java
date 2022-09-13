package com.StringBuilder;

public class stringBuilder1 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();// 16 bit capacity
		System.out.println(s.capacity());
		StringBuilder s1 = new StringBuilder("mahesh");
		// append method is used to adding any values like
		// char,String,Integer,Double,Byte,Boolean
		s1.append("." + "unukuru");
		System.out.println(s1);
		s1 = s1.append("  B tech");
		System.out.println(s1);
		StringBuilder s2 = new StringBuilder("unukuru");
		s2.append("+" + s2);
		System.out.println(s2);
		StringBuilder s3 = new StringBuilder("system");
		s3 = s3.append("+" + 12.00);
		System.out.println(s3);
	}
}
