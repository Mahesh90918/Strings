package com.equals;

public class equals {
	public static void main(String[] args) {
         String s= "mahesh";
		String s1 = "mahesh";
		String s2="unukuru";
		String s5=s+"mahesh";//stores heap area because( variable and constant)
		String s3=new String("mahesh");
		String s4=new String("unukuru");
		String s6=new String("unukuru");
		//content compare .equal()
		System.out.println(s1.equals(s2));// false,,because content compare
		System.out.println(s1.equals(s3));//true 
		System.out.println(s2.equals(s4));//true
		System.out.println(s4.equals(s6));//true
		System.out.println(s2.equals("unukuru"));//true
		System.out.println(s1.equals("mahesh"));
		// reference compare only ==
		System.out.println(s==s1);// true 
		System.out.println(s1==s3);// false
		System.out.println(s4==s6);// false
		System.out.println(s==s5);// false
		
		
	}
}
