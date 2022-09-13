package com.comparable;

import java.util.Arrays;

public class TestEmpolyee {
	public static void main(String[] args) {
		empolyee e1 = new empolyee(1, "mahesh", 20000);
		empolyee e3 = new empolyee(3, "mahesh", 20000);
		empolyee e4 = new empolyee(4, "mahesh", 20000);
		empolyee e5 = new empolyee(5, "mahesh", 20000);
		empolyee e2 = new empolyee(2, "mahesh", 20000);
		empolyee emp[] = { e1, e3, e4, e5, e2 };
		for (empolyee Ee : emp) {

		// System.out.println(Ee);//just print array data
// when we used sorting method every data into ascending order format
			Arrays.sort(emp);
			Ee.diplaydata(); 
		}

	}
}
