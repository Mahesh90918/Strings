package importantpro;

public class repatedcharacter {
	public static void main(String[] args) {
		String s = "java is a java programe";
		char firstRepatedchar = ' ';
		char firstNotRepatedchar = ' ';
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp != ' ') {
				if (s.indexOf(temp) == s.lastIndexOf(temp)) {
					if (firstNotRepatedchar == ' ') {
						firstNotRepatedchar = temp;
					}
				} else if (firstRepatedchar == ' ') {
					firstRepatedchar = temp;
				}
			}
			if (firstNotRepatedchar != ' ' && firstRepatedchar != ' ') {
				break;
			}
		}
		System.out.println("input :" + s);
		System.out.println("firstNotRepatedchar :" + firstNotRepatedchar);
		System.out.println("firstRepatedchar :" + firstRepatedchar);
	}
}
