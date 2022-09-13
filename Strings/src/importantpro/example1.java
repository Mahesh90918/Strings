package importantpro;

public class example1 {
	public static void main(String[] args) {
		String s = "mahesh is good boy";
		System.out.println(s.length());// 19
		System.out.println(s.split(" ").length);// 4 words count

		char target = 'o';
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == target) {
				count++;
			}
		}
		System.out.println("number of repeted letters :" + count);

	}
}
