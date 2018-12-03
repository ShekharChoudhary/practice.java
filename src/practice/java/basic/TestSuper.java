package practice.java.basic;

public class TestSuper {
	
	public static void main(String[] args) {
		TestReflection test = new TestReflection();
		
	}
}


class TestReflection {
	
	public TestReflection(){
		System.out.println("this is reflection constructor");
	}
	
	public void testMethod1(){
		System.out.println("This is test method 1");
	}
	
	private void testMethod2(){
		System.out.println("This is test method 2");
	}
}


