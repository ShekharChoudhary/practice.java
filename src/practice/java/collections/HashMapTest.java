package practice.java.collections;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<Company, Integer> map = new HashMap<>();
		
		map.put(new Company("a", 1), 1);
		map.put(new Company("a", 2), 1);
		map.put(new Company("a", 3), 1);
		map.put(new Company("a", 4), 1);
		map.put(new Company("a", 5), 1);
		map.put(new Company("a", 6), 1);
		
	}
}
