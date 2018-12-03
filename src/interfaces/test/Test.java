package interfaces.test;

public class Test implements Interface1, Interface2{

	@Override
	public void test() {
		System.out.println("Test method implemented");
		
	}

	public static void main(String[] args) {
		Interface1 x = new Test();
		x.test();
		
		Interface2 y = new Test();
		y.test();
	}
}
