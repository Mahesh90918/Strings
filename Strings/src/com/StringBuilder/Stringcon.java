package com.StringBuilder;

public class Stringcon {
public static void main(String[] args) {
	String s1="150";
	Integer i=new Integer(150);
	System.out.println(s1.equals(i.toString()));
	StringBuilder s=new StringBuilder("150");
	s.append("150");
	System.out.println(s+"150");
}
}
