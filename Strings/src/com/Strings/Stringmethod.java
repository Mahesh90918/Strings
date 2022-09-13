package com.Strings;

public class Stringmethod {
public static void main(String[] args) {
	String s1="mahesh";
	String s2="MAHESH";
	System.out.println(s1.equals(s2));
	// capital or small ignores the equalIgnore method
	System.out.println(s1.equalsIgnoreCase(s2));
	//Particular index number calls what you wont
	System.out.println(s1.charAt(2));
	System.out.println(s1.charAt(3));
}
}
