package functional.interfaces.test;

@FunctionalInterface
public interface FInterface1 {

	public void test();
	

	default void test12() {
		System.out.println("this is test1 of FInterface1");
	}
}
