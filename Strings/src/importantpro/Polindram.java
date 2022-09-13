package importantpro;

import java.util.Arrays;

public class Polindram {
	public static String getReverseString(String inputString) {
		String reverseString = "";// gap not taken
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString += inputString.charAt(i);
		}
		return reverseString;
	}

	public static void main(String[] args) {
		String s = "131";
		String output = "";
		if (getReverseString(s).equals(s)) {
			output = "it is polindram";
		} else {
			output = "it is not polindram";
		}
		System.out.println(getReverseString("132").equals("231"));
		System.out.println("output :" + output);
		
	}
}
