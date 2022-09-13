package importantpro;

public class evenWordUpper {
	public static void main(String[] args) {
		String s = "mahesh is a good boy He studided well a b c d e f";
		String[] words = s.split(" ");
		String outputstring = " ";
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {// 0,2,4,6,8, even printing capital
				outputstring += words[i].toUpperCase()+" ";
			} else {
				outputstring += words[i].toLowerCase() +" ";
			}
		}
		System.out.println(outputstring );
	}
}
