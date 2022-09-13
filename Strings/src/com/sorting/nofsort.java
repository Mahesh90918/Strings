package com.sorting;

import java.util.Arrays;

public class nofsort {
	public static void main(String[] args) {

		System.out.println("enter the values");
		int[] arr = { 1, 3, 4, 5, 3, 2, 1 };
		int[] arr1 =new int[] { 1, 3, 4, 5, 3, 2, 1 };

		Arrays.sort(arr);
		// prints array using the for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("\n" + "....Another way print array...");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr1);// converting order
		System.out.println(Arrays.toString(arr1));

	}
}
