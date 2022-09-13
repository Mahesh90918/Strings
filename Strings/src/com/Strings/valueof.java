package com.Strings;

public class valueof {
	public static void main(String[] args) {
		int a = 100;
		// The String class valueOf() method coverts given type such as int, long,
		// float, double, boolean, char and char array into String.
          char ch='a';
		String s = String.valueOf(a);
		String chs=String.valueOf(ch);
		System.out.println(s + 100 + 100);
		System.out.println(chs+'a'+'b');
	}
}
