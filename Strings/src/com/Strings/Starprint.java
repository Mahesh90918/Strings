package com.Strings;

public class Starprint {
	public static void main(String[] args) {
		String s = "mahesh";
		char[] arr = s.toCharArray();
		char search = 'a';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				arr[i]='*';// must
			}
			System.out.print(arr[i]);
		}
	}
}
