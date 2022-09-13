package com.Strings;

public class example {
public static void main(String[] args) {
	String a="mahesh";
	String b="mahesh";
	System.out.println(a==b);
	System.out.println(a.equals(b));
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	String c="FB";
	String d="Ea";
	char ch= 'F';
	// both hascodes are equal
	System.out.println(c==d);
	System.out.println(c.equals(d));
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	System.out.println((int)ch);
	
}
}
