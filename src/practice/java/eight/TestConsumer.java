package practice.java.eight;

import java.util.function.Consumer;

public class TestConsumer {


	public static void main(String[] args) {
		Consumer<String> x = (String name) -> myConsumerMethod(name);
		x.accept("shekhar");
		Consumer<String> y = TestConsumer :: myConsumerMethod;
		y.accept(" Choudhary");
	}
	
	static void myConsumerMethod(String name) {
		System.out.print(name);
	}
	
	
}



