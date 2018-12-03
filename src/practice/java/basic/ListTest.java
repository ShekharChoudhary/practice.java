package practice.java.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> array = new ArrayList<>();
		LinkedList<String> link = new LinkedList<>();
		link.add("a");
		link.add("b");
		System.out.println(link.get(1));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(1, 3);
		System.out.println("map "+map.size());
	}
}
