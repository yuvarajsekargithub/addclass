package org.locator;

public class Super extends Practise {
public static void main(String[] args) {
	String a ="Welcome";
	char c = a.charAt(1);
	System.out.println(c);
int i = a.length();
System.out.println(i);
String case1 = a.toUpperCase();
System.out.println(case1);

String case2 = a.toLowerCase();
System.out.println(case2);
boolean equals = a.equals("Welcome");
System.out.println(equals);

String string = a.substring(2, 5);
System.out.println(string);

}
}
