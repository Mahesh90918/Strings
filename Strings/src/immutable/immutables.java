package immutable;

public class immutables {
public  static void main(String[] args) {
	String s="mahesh";
	System.out.println(s.concat("unukuru"));
 //Here mahesh is not changed but a new object is created with mahesh unukuru
	// That is why String is known as immutable.
}
}
//As you can see in the above figure that two objects are created 
//but s reference variable still refers to "mahesh" not to "mahesh unukuru".