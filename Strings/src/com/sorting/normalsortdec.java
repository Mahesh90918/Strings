package com.sorting;

public class normalsortdec {
public static void main(String[] args) {
	int []s= {1,2,5,6,7,8,4,3,0};
	int temp;
	System.out.println(".... descending order...");
	for(int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++) {
			//just change condition
			if(s[i]<s[j]) {
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}System.out.print(s[i]);
	}
}
}
