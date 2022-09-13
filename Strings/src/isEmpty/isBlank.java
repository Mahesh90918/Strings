package isEmpty;

public class isBlank {
	public static void main(String[] args) {
		// StringUtils.isBlank() checks that each character of the
		// string is a whitespace character
		// (or that the string is empty or that it's null).
		// This is totally different than just checking if the string is empty.

		String s = null;
		String s1 = "";
		String s2 = " ";
		String s3 = " mahesh";
		// System.out.println(s.isBlank());//NullpointerException
		System.out.println(s1.isBlank());// true
		System.out.println(s2.isBlank());// true
		System.out.println(s3.isBlank());// false

		// just knowledge purpose

		// StringUtils.isBlank() checks that each character of the
		// string is a whitespace character
		// (or that the string is empty or that it's null).
		// This is totally different than just checking if the string is empty.

//	         StringUtils.isBlank(null); //     = true
//			 StringUtils.isBlank("") ; //      = true  
//			 StringUtils.isBlank(" ") ; //     = true  
//			 StringUtils.isBlank("bob");//     = false  
//			 StringUtils.isBlank("  bob  "); //= false
	}
}
