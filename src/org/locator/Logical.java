package org.locator;

public class Logical {
	public static void main(String[] args) {
		int a=20 , b=30, c =40, d=50;
		if (a>b|a>c|a<50){
			System.out.println("true");
		}else {
			System.out.println("false");
		}if (b>a|b>c|b>d) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}if (c<a|c>b|c>d) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
