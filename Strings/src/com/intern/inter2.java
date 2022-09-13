package com.intern;

public class inter2 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = s1 + s2;
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s2 == s3);// false
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s3));// false

		String s4 = "Octavia";
		String s5 = new String("Octavia");
		String s6 = s4.intern();
		System.out.println("S4 Hashcode" + s4.hashCode());
		System.out.println("S5 Hashcode" + s5.hashCode());
		System.out.println("S6 Hashcode" + s6.hashCode());
		System.out.println(s4+"   ");

	}
}
