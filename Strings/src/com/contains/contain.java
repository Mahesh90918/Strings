package com.contains;

public class contain {
	public static void main(String[] args) {
		String s1 = " which index the searched index is found.";
		System.out.println(s1.contains("which index the searched index is found."));// true
		// which index the searched index is found or not checking like that
		System.out.println(s1.contains("which index"));// true
         //case sensitive like capital letters
		System.out.println(s1.contains("Index"));// false because capital "I"
	}
}
