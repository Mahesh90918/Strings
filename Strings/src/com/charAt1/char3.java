package com.charAt1;

public class char3 {
public static void main(String[] args) {
	String s1="mahesh";
	String s2="unukuru";
	String s3=new String("mahesh");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	int count =0;
	for(int i=0;i<s1.length();i++) {
			if (s1.charAt(i) == 'h') {

				count++;
				char h = '*';
			}System.out.print(s1.charAt(i));

	}
}
}
