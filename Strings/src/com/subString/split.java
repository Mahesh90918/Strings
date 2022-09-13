package com.subString;

import java.util.Arrays;

public class split {
	public static void main(String[] args) {
		String s = new String("mahesh is a good boy");

		String[] sentence = s.split("");// convert each letter into character
		System.out.println(Arrays.toString(sentence));
		String[] sentence1 = s.split(" ");// convert each word into character
		System.out.println(Arrays.toString(sentence1));
		// It accepts an argument \\. that checks a in the sentence and splits the
		// string into another string. It is stored in an array of String objects
		// sentences.

		String[] sentence2 = s.split("\\.");
		System.out.println(Arrays.toString(sentence2));
	}
}
