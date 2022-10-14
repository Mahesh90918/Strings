package Stringimp2;

public class count {

	public static void main(String[] args) {
		int a = 12345;
		String s = Integer.toString(a);
		System.out.println(s.length());

		int count = 0;
		while (a > 0) {
			count++;
			a = a / 10;
		}
		System.out.println(count);
		int count1 = 0;
		for (int i = 0; i <s.length(); i++) {
			count1++;
		}
		System.out.println(count1);
	}

}
