package importantpro;

public class ExtensionFileName {
	public static void main(String[] args) {
		String s = "file.jgjsd.txt";// . txt Extension
		// last Index used only last . is Extension
		String output = s.substring(s.lastIndexOf("."), s.length());
		System.out.println("output Extension =  " + output);
	}
}
