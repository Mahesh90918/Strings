package com.Strings;

public class replace {
public static void main(String[] args) {
	String s1="Java is a programming language. Java is a platform. Java is an Island.";
	String s2=s1.replace("Java", "mahesh");
	System.out.println(s2);
	System.out.println(s1.replace("Java", "mahesh"));
	// replace the word
	String s="mahesh";
	System.out.println(s.replace("ma", "mh"));
}
}
