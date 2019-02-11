package org.locator;

public class Constructor {
	
	public Constructor( ) {
		this(10);
		System.out.println("i am in constructor"); 
	 


	}
	public Constructor(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Const");
	}
	


	public static void main(String[] args) {
	
		Constructor cl = new Constructor();
		
	}
	

}
