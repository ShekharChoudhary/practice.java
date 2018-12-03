package practice.java.basic1;

public class TestParent extends X{
	public static void main(String[] args) {
		String x = "abc";
		x.toUpperCase();
		System.out.println(x);
	}
}


class X{
	{
		System.out.println("parent one");
	}
	public X() {
		System.out.println("parent");
	}
}