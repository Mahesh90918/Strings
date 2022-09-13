package com.concat;

public class concat {
	public static void main(String[] args) {
		String s = "mahesh";
		s.concat("unukuru");
		// its cannot be changed that's why it is IMMUTABLE
		System.out.println("IMMUTABLE :"+s);
		String s1 = "unukuru"+".".concat(s);
		// concat using front adding names
		System.out.println("font adding name  :" + s1);
		// concat using back end adding names
		String s2 = s.concat("."+"unukuru");
		System.out.println("End adding name  :" + s2);
		
		StringBuilder sb=new StringBuilder("mahesh");
		sb.append("unukuru");
		// its can be changed that's why it is MUTABLE
		System.out.println("MUTABLE  :"+sb);

	}
}
