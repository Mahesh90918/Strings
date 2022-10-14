package importantpro;

import java.util.StringJoiner;

public class Stringjoinner {
public static void main(String[] args) {
	StringJoiner str=new StringJoiner(",");
	str.add("mahesh");
	str.add("vanja");
	str.add("padma");
	System.out.println(str);
	StringJoiner str1=new StringJoiner(":","[","]");
	str1.merge(str);
	str1.add("P");
	str1.add("Q");
	System.out.println(str1);
}
}
