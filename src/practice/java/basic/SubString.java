package practice.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubString {

	public static void main(String[] args) {
		
		String x = "aabbbcccddd";

		String[] y = x.split("a");
		
		List list = Arrays.asList(y);
		list.stream().forEach(p -> System.out.println(p));
	}

}
