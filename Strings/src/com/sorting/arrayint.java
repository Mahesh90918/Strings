package com.sorting;

import java.util.Arrays;

public class arrayint {
	static String m="mahesh";
	
public static void main(String[] args) {
	m="unukuru";// static changes
	int[] arr= {9,6,7,8,4,3,2,5,1};
	
	Arrays.sort(arr, 2, 7);
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	System.out.println(" static changes :"+m);
	
}
}
