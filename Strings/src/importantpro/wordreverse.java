package importantpro;

public class wordreverse {
	// method typpe creation
	// 1. method
	static String getReverseString(String inputString) {
		String reverse = " ";
		for (int i1 = inputString.length() - 1; i1 >= 0; i1--) {
			reverse += inputString.charAt(i1);

		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "mahesh is the good boy";

		// each word reverse
		String[] st = s.split(" ");
		String outputString = "";
		for (int i = 0; i < st.length; i++) {
			String word = st[i];
			// 2.method
			String reverse = " ";
			for (int i1 = word.length() - 1; i1 >= 0; i1--) {
				reverse += word.charAt(i1);
			}
			outputString += reverse;
			if (i != st.length - 1) {
				outputString += reverse + " ";
			}
		}
		System.out.println("reverse String : " + outputString);

	}
}
