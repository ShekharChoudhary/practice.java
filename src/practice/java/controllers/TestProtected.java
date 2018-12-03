package practice.java.controllers;

public class TestProtected {

	protected void test(){
		System.out.println("TestProtected");
		TestProtected t = new TestProtected();
		t.test1();
	}
	
	 void test1(){
		System.out.println("this is private");
	}
	 
	public void test2(){
			System.out.println("this is private");
		}
}

class Test{
	
	public void method1(){
		TestProtected t = new TestProtected();
		t.test();
	}
}
