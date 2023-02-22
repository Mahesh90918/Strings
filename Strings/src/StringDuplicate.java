package com.String;

public class StringDuplicate {

	public static String removeDuplicates(String input) {
		String result = "";
		String duplicate = "";
		for (int i = 0; i < input.length(); i++) {
			if (!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			} else {
				duplicate += String.valueOf(input.charAt(i));
			}
		}
		return duplicate;
	}

	public static void main(String[] args) {

		String string = "hellohe";
		System.out.println(removeDuplicates(string.toUpperCase()));
	}

}
