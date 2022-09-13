package com.getByte;

public class getbyte {
public static void main(String[] args) {
	String s1="mahesh";
	//character converted  into byte
	byte[] arr=s1.getBytes();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
		
}
}
