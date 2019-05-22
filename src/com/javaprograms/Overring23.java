package com.javaprograms;

public class Overring23 {
	public static void main(String[] args) {
		OverridngExample 	o1=new OverridngExample();
		o1.eat();
		OverridngExample 	o2=new subclass();
		o2.eat();
		subclass sb=(subclass) new OverridngExample();
		
		sb.eat();
	}

}
