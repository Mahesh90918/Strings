package com.Strings;

public class HEllo {
	public static void main(String[] args) {
		String s = "Helloworld";
		s=s.substring(0, 1).toLowerCase()+s.substring(1);
		s=s.substring(4, 5).toUpperCase();
		s=s.substring(0, 1).toUpperCase()+s.substring(1);
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}
	}
}
