package com.javaprograms;

 class OverridngExample {
	
	void eat()
	{
		System.out.println("eating main animals");
	}

}
 class subclass extends OverridngExample
{
	void eat() { 
		System.out.println("am eating subclass");
	}
}
  
