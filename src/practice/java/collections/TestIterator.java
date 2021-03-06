package practice.java.collections;

import java.util.HashMap;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		map.put("5", "Five");
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println("key : "+key+" value : "+map.get(key));
		}
	}
}
