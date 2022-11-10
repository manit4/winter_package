package com.winter.controller;//package statement must be the first statement...

import com.winter.ArithmaticOperations;

public class Bird {
	
	public void chirp() {
		System.out.println("inside chirp()...");
	}

	void eating() {
		System.out.println("inside eating()...");
	}
	
	void flying() {
		System.out.println("inside flying()...");
	}
	
	void accessAdd() {
		
		ArithmaticOperations ao = new ArithmaticOperations();
		
		ao.add();//I can  not access the add() of ArithmeticOperations class since first of all, both Bird and ArithmeticOperations class are in 
				//2 different packages and the add() which i am trying to access is declared default. So default says I am limited ony
				//to my own package. Even if you want to use the add methof from Bird class, you should change its visibility to public
				//else you can not access it
	}
}


//=============below is the version 1---------

//public class Bird {
//	
//	void chirp() {
//		System.out.println("inside chirp()...");
//	}
//
//	void eating() {
//		System.out.println("inside eating()...");
//	}
//	
//	void flying() {
//		System.out.println("inside flying()...");
//	}
//}
