package com.Strings;

public class Stringtoint {
public static void main(String[] args) {
	
	String s="mahesh";
	String s1=new String("mahesh");
	Integer i = Integer.parseInt(s1);
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(i.hashCode());
//	System.out.println(i.equals(s1));
}
}
