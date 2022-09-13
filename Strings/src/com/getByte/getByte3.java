
package com.getByte;

public class getByte3 {
public static void main(String[] args) {
	String s1="mahesh";
	String s2="unukuru";
	System.out.println(s1.compareTo(s2));
	byte [] arr=s1.getBytes();
	byte[] arr1=s2.getBytes();
	char c='m';
	System.out.println((int)c);//107 m letter ASCII value
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		 sum=arr[i]+sum;
		System.out.println(sum);
	}int sum1=0;
	for(int i=0;i<arr1.length;i++) {
		 sum1=arr1[i]+sum1;
		System.out.println(sum1);
	}System.out.println(sum-sum1);

}
}
