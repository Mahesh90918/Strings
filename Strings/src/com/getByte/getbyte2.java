package com.getByte;

import java.io.UnsupportedEncodingException;

public class getbyte2 {
	public static void main(String[] args){
		
	
	String s1=" welcome to javaTpoint";
	// inside try block encoding is   
	// being done using different charsets
	try {
	// 16-bit converting
		//16 - bit UCS Transformation format 
			byte[] arr1=s1.getBytes("UTF-65");
			for(int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]);
			}System.out.println("\n");
		
	}	catch (UnsupportedEncodingException g) {
		System.out.println(g);
	}
}
}