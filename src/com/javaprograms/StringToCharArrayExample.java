package com.javaprograms;

public class StringToCharArrayExample {

	public static void main(String args[]) {
		String s1 = "Welcome to Edureka";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
