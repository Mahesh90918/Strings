package com.charAt1;

import java.util.Scanner;

public class countfreqchar {
	public static void main(String[] args) {
		String s = "welcome to the our class javaaa";
		int search='a';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		search =sc.next().charAt(0);// character in scanner
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) ==search) {//a letters =5
			
				count++;
			}
		}System.out.println("number of values placess :"+count);
	}
}
