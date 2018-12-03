package test.inner.classes;

public class Outer {

	public void test() {
		System.out.println("this is outer class");
	}
	
	public class Inner {
		
		public void test() {
			System.out.println("this is inner class");
		}
		
		public void test1() {
			Outer.this.test();
			test();
		}
	}
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.test1();
	}
}
