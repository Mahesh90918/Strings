package com.sorting;

public class normalsort {
public static void main(String[] args) {
	int[] a= {1,9,4,0,9,2,3,4,5,5};
	int temp=0;
	System.out.println("..... ascending order....");
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}System.out.print(a[i]);
	}
}
}
