package com.Strings;

import java.util.StringTokenizer;

public class impexamplee {
public static void main(String[] args) {
	String s="mahesh";
	System.out.println((char)65);//A
	System.out.println(s.charAt(0));
	System.out.println(s.indexOf('m'));//0
	System.out.println(s.indexOf('M'));//-1
	System.out.println(s.hashCode());
	System.out.println(s);
	s.concat("unukuru");
	System.out.println(s);// mahesh
	System.out.println(s.hashCode());
	
	String s1=s.concat("lakkupuram");
	System.out.println(s1);
	System.out.println(s1.hashCode());
	
	s="unukuru";
	System.out.println(s);
	System.out.println(s.hashCode());
	System.out.println(",,,,,,,,,,,,,String,,,,,,,,,,,,,,,,");
	String s4=new String("mahesh");
	String s5=new String("mahesh");
	System.out.println(s4==s5);//false
	System.out.println(s4.equals(s5));//true
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	StringBuffer b=new StringBuffer("mahesh");
	System.out.println(b);
	System.out.println(b.hashCode());
	b.append("unukuru");
	System.out.println(b);
	System.out.println(b.hashCode());
	b.replace(0, 3, "ii");
	System.out.println(b);
	System.out.println(b.hashCode());
	b=new StringBuffer("unukuru");// diff hascode
	System.out.println(b);
	System.out.println(b.hashCode());
	System.out.println("........StringBuffer...........");
	StringBuffer b2=new StringBuffer("mahesh");
	StringBuffer b3=new StringBuffer("mahesh");
	System.out.println(b2==b3);//false
	System.out.println(b2.equals(b3));//false
	System.out.println("...................");
	StringBuffer b6=new StringBuffer("mahesh");
	String str="salary";
	b6.append(str);
	b6.append("Next");
	b6.append(6000988);
	//System.out.println(b6);
	b6.append(80000);
	System.out.println(b6);
	System.out.println("...................");
	StringBuilder b7=new StringBuilder("mahesh");
	//String str1="salary";
	//b7.append(str1);
	b7.append("Next");
	b7.append(55555);
	b7.append(666666);
	//System.out.println(b6);
	b7.append(777777);
	b7.deleteCharAt(0);// index 0 delete
	System.out.println(b7);
	System.out.println("===========================");
	StringTokenizer st=new StringTokenizer("mahesh is a good boy");
	//Split the String with by default(space Symbol)
	while(st.hasMoreElements()) {// infinite loop
		System.out.println(st.nextElement());
	}
	System.out.println("===========================");
	String strrrr="mahesh,is,a,good,boy";
	StringTokenizer st1=new StringTokenizer(strrrr);
	while(st1.hasMoreElements()) {// infinite loop
		System.out.println(st1.nextElement());
	}
	
}
}
