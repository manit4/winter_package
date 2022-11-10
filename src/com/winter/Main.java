package com.winter;

import com.winter.controller.Bird;

public class Main {

public static void main(String[] args) {
	
	ArithmaticOperations aop = new ArithmaticOperations();
	
	aop.add();
	
	System.out.println("The value of k is "+aop.k);
	
	Bird sparrow = new Bird();
	
	sparrow.chirp();//I could access only chirp() of Bird class since I made chirp() public in Bird class 
	sparrow.flying();//this os still illegal since this method in te Bird class in still default....
	sparrow.eating();//this os still illegal since this method in te Bird class in still default....
}

}


//==================below is the version 1------------------
//
////import com.winter.controller.*;//package name followed by ".*" means that you need to import the whole package which is not recommended at all since 
////the package might have hundreds of classes and you do not need all the hundred classes but just few like 3 or 4 classess
//				//so in that case, importing all the classes is not good. So instead, I would individually import the specific class which I need in my program
//				//Below is the way to import the specific class...
//
//import com.winter.controller.Bird;//here I am not importing the whole package but to import the specific class which is Bird class
//
//public class Main {//If you create class in some package instead of default package, you get to see the package statement at the top...
//					//and the package statement must be the first statement in the file...
//
//	public static void main(String[] args) {
//		
//		ArithmaticOperations aop = new ArithmaticOperations();
//		
//		aop.add();//this add() is in the class named ArithmaticOperations and in the same package as Main class
//		
//		System.out.println("The value of k is "+aop.k);
//		
//		Bird sparrow = new Bird();//if you are trying to use anything outside of your own package then you must import that specific thing first before using in  your class...
//									//Even though, this Bird class is in different package I could successfully access it since the 
//									//class access-modifier is public if this would have been default then you would not be able to access it...  
//		
//		sparrow.chirp();//This is illegal since the member you are trying to access in default and default keyword says I am limited to only same package...
//		sparrow.flying();//This is illegal since the member you are trying to access in default and default keyword says I am limited to only same package...
//		sparrow.eating();//This is illegal since the member you are trying to access in default and default keyword says I am limited to only same package...
//	}
//	
//}



//We have 4 different access-modifiers or access-specifiers....


//private---- it is a keyword which is used with any member of a class and is the most strict among all. IT IS used only with
		//the members of a class but you can not use this with class that means you can not make any class private. It has access only inside 
		//its own class
//default---- default is not a keyword but if you see any class, any variable, any method without any of these access-modifiers(private
		//protected and public) then consider this as default...This is less strict than private. The visibility or accessibility 
		//is only limited to its own package
//protected
//public---- this is also a keyowrd which is used with classes, methods, variables, constructors...This is the least strict access
		//modifier

//---------------Important points below-------------
//1) classes can be either public of default not private nor protected...
//2) you can have any member of a class with any access-modifier such as methods, variables, constructors. These members of a class 
		//can be eitehr public , protected, private or default
