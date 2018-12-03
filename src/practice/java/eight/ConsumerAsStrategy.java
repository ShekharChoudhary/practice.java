package practice.java.eight;

import java.util.function.Consumer;

public class ConsumerAsStrategy {

	Consumer<String> value;
	public ConsumerAsStrategy(Consumer<String> value){
		this.value = value;
	}
	
	public void printValue(){
		
		value.accept("Shekhar");
	}
}
