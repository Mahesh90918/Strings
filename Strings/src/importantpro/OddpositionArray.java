package importantpro;

import java.util.Arrays;

public class OddpositionArray {
	public static void main(String[] args) {
		String s = "java is a java programe";
		String[] word = s.split(" ");
		String[] outputarray = new String[word.length / 2];// print Half Array odd only
		int index = 0;
		for (int i = 1; i < word.length; i++) {
			if (i % 2 != 0) {
				outputarray[index] = word[i];
				index++;
			}
		}
		System.out.println("input :"+s);
		System.out.println("Word :"+Arrays.toString(word));
		System.out.println("ouput Arraay of output :"+Arrays.toString(outputarray));
		
	}
}
