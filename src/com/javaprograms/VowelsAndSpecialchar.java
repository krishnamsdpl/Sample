package com.javaprograms;

public class VowelsAndSpecialchar {
	public static void main(String[] args) {
		
		String str="krishnamdr290@gmail.com";
		int vowels=0;
		int constents=0;
		int digit=0;
		int special=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				++vowels;
			}
			else if(ch>='a'&&ch<='z') {
				++constents;
			}
			else if(ch>='0' && ch<='9') {
				++digit;
			}
			else {
				++special;
			}
		}
		System.out.println("vowels=="+vowels);
		System.out.println("constents=="+constents);
		System.out.println("digit=="+digit);
		System.out.println("special=="+special);
	}

}
