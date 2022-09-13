package com.Strings;

public class reversestring {
public static void main(String[] args) {
	String s="mahesh";
for(int i=0;i<s.length();i++) {
	System.out.println(i +" :char :"+s.charAt(i));
}for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i)+" ");
	
}
}
}