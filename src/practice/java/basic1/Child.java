package practice.java.basic1;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = new Child();
		Parent p1 = new Parent();
		
		c.test();
		c.testChild();
		
		p.test();
		
		p1.test();
		
		
	}
	
	public void testChild() {
		System.out.println("This is child");
	}
}
