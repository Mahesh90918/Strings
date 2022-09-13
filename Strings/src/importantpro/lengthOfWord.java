package importantpro;

public class lengthOfWord {
	public static void main(String[] args) {
		String s = "java is ab java programe";
		String[] word = s.split(" ");
		String MaxlenWord = word[0];// first index print
		for (int i = 0; i < word.length; i++) {
			if (MaxlenWord.length() < word[i].length()) {
				MaxlenWord = word[i];
			}
		}
		System.out.println("input :" + s);
		System.out.println("output :" + MaxlenWord);
	}
}
