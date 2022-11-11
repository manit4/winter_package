package com.winter;


public class MainPrivate {
	
	public static void main(String[] args) {
		
		Human manit = new Human();
		
		manit.studying();
		manit.gyming();
		
		System.out.println("-----------------");
		
		manit.iq = 230;//This is illegal since the variable I am trying to access is private. And private keyword says, you can 
					//access private variables only inside its own class...
		
	}

}
