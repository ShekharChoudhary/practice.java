package practice.java.basic;

import java.math.BigDecimal;

public class Child extends Parent{
	
	public static void test(){
		Integer.valueOf("");
		
	}
	
	public static void main(String [] args){
		BigDecimal c = new BigDecimal("0.01");
		System.out.println(new BigDecimal("0.01"));
	}
}


class Parent
{
	 public static void test()
	 	 {
		 	System.out.println("I am in parent");
	 }
		
}