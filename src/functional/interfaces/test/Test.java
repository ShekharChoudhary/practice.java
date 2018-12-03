package functional.interfaces.test;

public class Test implements FInterface1, FInterface2{

	@Override
	public void test() {
		System.out.println("this is test");
		
	}

	

	private static void main(String[] args) {
		FInterface1 test = new Test();
		
		
	}
}
