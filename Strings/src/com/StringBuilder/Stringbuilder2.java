package com.StringBuilder;

public class Stringbuilder2 {


public static void main(String[] args) {
	StringBuilder s=new StringBuilder("i am good boy");
//	inserting method is the values into StringBuilder
	// any type of values insert like char,String,Integer,Double,Byte,Boolean
    s.insert(1, 'A');
	System.out.println(s);
	s.insert(3, "mahesh ");
	System.out.println(s);
	StringBuilder s1=new StringBuilder("i am learing java program");
	s1.replace(4, 4, " mahesh");
	System.out.println(s1);
	StringBuilder s2=new StringBuilder("i am learing java program");
	//s2.trimToSize();
	s2.replace(0, 4, "mahesh");
	System.out.println(s2);
	StringBuilder s3=new StringBuilder("i am learing java program");
	s3.delete(0, 4);
	System.out.println(s3);
	StringBuilder s4=new StringBuilder("i am learing java program");
	System.out.println(s4.reverse());// only used in String builder and buffers only
}
}
