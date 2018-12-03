package practice.java.controllers;

import practice.java.datatypes.TestDataTypes;

public class Sparrow extends Bird {
	
	 String x;
	 
 public void fun() {
	System.out.println(x);
	 System.out.println("in sparow");
}
 
	public static void main(String[] args) {
		Sparrow x = new Sparrow();
		System.out.println(x.x);
	}
	
	
}
