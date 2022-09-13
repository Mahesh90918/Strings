package com.sorting;

import java.util.Arrays;

public class chartoString {
	public static void main(String[] args) {
		
	
	char[] arr= {'a','b','c','d'};
	//3 rd way to convert char to String
	Arrays.toString(arr);
	System.out.println(arr);
	
	// 1 st way to convert char to String
	String s1=String.valueOf(arr);
	System.out.println(s1);
	// 2 nd  way to convert char to String
	String s2=new String(arr);
	System.out.println(s2);
	}
}
