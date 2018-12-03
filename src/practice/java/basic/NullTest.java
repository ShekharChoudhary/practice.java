package practice.java.basic;

public class NullTest {
	
	public void display(Parent p)
	{
		System.out.println("Im parent");
	}
	
	public void display(Child c)
	{
		System.out.println("Im child");
	}

	
	public static void main(String[] args) {
		
		
		NullTest nullTest = new NullTest();
		nullTest.display(null);
	}

} 
 
