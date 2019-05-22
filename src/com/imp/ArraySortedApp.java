package com.imp;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortedApp {
	public static void main(String[] args) {
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
		Arrays.sort(arr,1,5);
		System.out.println("Soterd order"+Arrays.toString(arr));
		Arrays.sort(arr,1,5);
		System.out.println("only limited values"+Arrays.toString(arr));

		
		 String arr1[] = {"krishna","rama","laxman"}; 

 // Sorts arr[] in ascending order 
 Arrays.sort(arr1); 
 System.out.println("only limited names"+Arrays.toString(arr1));
	}
}
