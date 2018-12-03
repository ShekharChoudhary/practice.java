package practice.java.basic;

public class Test extends Parent1 {
	public static void main(String[] args) {
	
		Parent1 t = new Test();
		try {
			t.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void test () {
		System.out.println("child");
	}
}


class Parent1 {
	
	public void test() throws Exception{
		System.out.println("parent");
	}
}