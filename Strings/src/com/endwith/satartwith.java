package com.endwith;

public class satartwith {
public static void main(String[] args) {
	// method checks if this string ends with a given prefix.
		// true or false
		String s1="mahesh is bad boy";
		System.out.println(s1.startsWith("m"));//true,,,,suffix is y letter
		System.out.println(s1.startsWith("mah"));//true,,,,suffix is boy word
		System.out.println(s1.startsWith(" "));//prefix gap its true
		System.out.println(s1.startsWith(""));// true,,,, No gap
		System.out.println(s1.startsWith("mahesh"));// false " B" capital
		System.out.println("mahesh".startsWith("m"));//true

}
}
