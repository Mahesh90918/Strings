package com.intern;

public class intern {
	public static void main(String[] args) {
		String m = "mahesh";
		String a = "unukuru";
		String s = new String("mahesh");
		String s1 = new String("unukuru");
		String s2 = new String("mahesh");
		System.out.println(m.hashCode());
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(m == s);// false because reference variables are pointing to different instance
		System.out.println(s == s2);// false because reference variables are pointing to different instance
		// when use intern() content already stored in SCP area
		String s3 = s.intern();// returns string from pool, now it will be same as "m"
		System.out.println(m == s3);// true because reference variables are pointing to same instance
		// reference compare
		String s4 = s1.intern();// returns string from pool, now it will be same as "a"
		System.out.println(a == s4);// true because reference variables are pointing to same instance

	}
}
