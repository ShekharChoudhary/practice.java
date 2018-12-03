package functional.interfaces.test;

@FunctionalInterface
public interface FInterface2 {

	public void test();
	

	default void test1() {
		System.out.println("this is test1 of FInterface2");
	}
}
