package isEmpty;

public class isempty {
	public static void main(String[] args) {
		
//StringUtils isEmpty = String isEmpty checks + checks for null.
//StringUtils isBlank = StringUtils isEmpty checks + checks if the text contains only whitespace
	
		String s = null;
		String s1 = "";
		String s2 = " ";
		String s3 = " mahesh";
//		System.out.println(s.isEmpty());// Nullpointerexcepion
		System.out.println(s1.isEmpty());// true
		System.out.println(s2.isEmpty());// false
		System.out.println(s3.isEmpty());// false
		
		
		// just knowledge purpose
//		         StringUtils.isEmpty(null)      = true
//				 StringUtils.isEmpty("")        = true  
//				 StringUtils.isEmpty(" ")       = false  
//				 StringUtils.isEmpty("bob")     = false  
//				 StringUtils.isEmpty("  bob  ") = false
	}
}
