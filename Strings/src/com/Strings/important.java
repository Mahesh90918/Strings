package com.Strings;

public class important {
	public static void main(String[] args) {
// override the equals methods in String
		String s = "mahesh";
		System.out.println(s);
		System.out.println(s.hashCode());
		// up date the data
		// but hashCode is difference
		s = "unukuru";
		System.out.println(s);
		System.out.println(s.hashCode());
		// up date the data
		// but hashCode is difference
		s = "lakkupuram";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		StringBuffer s1= new StringBuffer("mahesh1");
		System.out.println(s1);
		System.out.println(s1.hashCode());

	}
}
