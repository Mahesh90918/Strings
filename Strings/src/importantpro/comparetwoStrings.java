package importantpro;

public class comparetwoStrings {
	public static void main(String[] args) {
		String s1 = "New York";
		String s2 = "NWYR";
		String output = " ";
		for (int i = 0; i < s1.length(); i++) {
			char temp = s1.toLowerCase().charAt(i);
			if (s2.toLowerCase().indexOf(temp) >= 0) {
				output += s1.charAt(i);

			} 
			else {
				output += '+';
			}
		}
		System.out.println("input 1 :" + s1);
		System.out.println("input 2 :" + s2);
		System.out.println("output :" + output);
	}
}
