package importantpro;

public class StringReversepolindram {
	public static void main(String[] args) {
		String s = "AMMA";
		char[] ch = s.toCharArray();
		StringBuilder str = new StringBuilder("");
		for (int i = ch.length - 1; i >= 0; i--) {
			str.append(ch[i]);
		}
		String reverse = str.toString();
		System.out.println(reverse);
		if (reverse.equals(s)) {
			System.out.println("polindram");
		} else {
			System.out.println(" Not polindram");
		}
	}
}
