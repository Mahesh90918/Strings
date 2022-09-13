package com.endwith;

public class endwith {
public static void main(String[] args) {
	// method checks if this string ends with a given suffix.
	// true or false
	String s1="mahesh is bad boy";
	System.out.println(s1.endsWith("y"));//true,,,,suffix is y letter
	System.out.println(s1.endsWith("boy"));//true,,,,suffix is boy word
	System.out.println(s1.endsWith(" "));// false
	System.out.println(s1.endsWith(""));// true,,,, No gap
	System.out.println(s1.endsWith("Boy"));// false " B" capital
	System.out.println("mahesh".endsWith("h"));//true

}
}
