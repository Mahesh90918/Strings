package com.sorting;

import java.util.Arrays;
import java.util.Collections;

public class sortpremitative {
public static void main(String[] args) {
	int [] arry= {1,23,6,5,8,4,3};
	Arrays.sort(arry);
	System.out.println(" assending order :" +Arrays.toString(arry));
	double [] arr= {1.09,1.98,1.76,1.9,1.87};
	Arrays.sort(arr);
	System.out.println(" assending order :"+Arrays.toString(arr));
	// convert wrappers class
	Integer [] arry1= {1,23,6,5,8,4,3};
	Arrays.sort(arry1,Collections.reverseOrder());
	System.out.println("Array elements in descending order:"+Arrays.toString(arry1));
	
	Double [] D= {1.11,2.32,2.33,12.34};
	
	Arrays.sort(D,Collections.reverseOrder());
	//normal method type
	for(int i=0;i<D.length;i++) {
		System.out.print(D[i]);
	}
	System.out.println("\n");
	System.out.println("Array elements in descending order:"+Arrays.toString(D));
}
}
