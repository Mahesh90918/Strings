package importantpro;

public class countletters {
	public static void main(String[] args) {
		String s = "HDHDDHkhga982374676^%##@#@djfJsdahjg";
		char[] ch = s.toCharArray();
		int uppercaseLettersCount = 0;
		int lowercaseLettersCount = 0;
		int SpecialcharactersCount = 0;
		int digitsCount = 0;
		for (char c : ch) {
			// Charcater have a methods
			if (Character.isUpperCase(c)) {
				uppercaseLettersCount++ ;
			} else if (Character.isLowerCase(c)) {
				lowercaseLettersCount++;
			} else if (Character.isDigit(c)) {
				digitsCount++;
			} else {
				SpecialcharactersCount++;
			}
		}
		
		System.out.println("Input  :" + s);
		System.out.println("uppercaseLettersCount  :" + uppercaseLettersCount);
		System.out.println("lowercaseLettersCount  :" + lowercaseLettersCount);
		System.out.println("digitsCount            :" + digitsCount);
		System.out.println("SpecialcharactersCount :" + SpecialcharactersCount);
	}
}
