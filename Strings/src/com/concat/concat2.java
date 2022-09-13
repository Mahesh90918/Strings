package com.concat;

public class concat2 {
	public static void main(String[] args) {
	String s1 = "mahesh";
     String s2="unukuru";
     //before adding name and after adding names
     String s3="NAME :".concat(s1).concat(".").concat(s2)+" ,";
     String s4="FIRSTNAME  :".concat(s1).concat(" :  surname :").concat(s2);
     //concat using so many ways   
     System.out.println(s3);
     System.out.println(s4);
}
}