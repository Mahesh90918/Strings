package com.charAt1;

public class charAt {
public static void main(String[] args) {
	String s= "welcome to the institute";
	int slength=s.length();
	System.out.println("index first vale  :"+s.charAt(0));
	System.out.println("index last value   :"+s.charAt(slength-1));
	System.out.println("lenghth method :"+s.length());
	
	String name="mahesh";
	char ch=name.charAt(4);
	System.out.println("one why calls :"+ch);
	System.out.println("othe why call  :"+name.charAt(5));
	
}
}
