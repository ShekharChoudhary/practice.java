package practice.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		list.add("ten");
		
		ArrayList<String> newList = new ArrayList<>();
		
		list.stream().forEach( str -> {
				if(newList.size() <5)newList.add(str);});

		System.out.println(newList);

	}
}
