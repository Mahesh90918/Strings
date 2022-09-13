package com.sorting;

import java.util.Arrays;
import java.util.Collections;

public class arraysort {
public static void main(String[] args) {
	String [] arr= {"mahesh","padma","yugundhar","hyma","hari","vanaja","santhosh"};
	System.out.println(" ......ASSENDING ORDER......");
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(" ......DESCENDING ORDER......");
	Arrays.sort(arr,Collections.reverseOrder());
	System.out.println(Arrays.toString(arr));
}
}
