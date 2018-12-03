package practice.collections;

import java.util.*;


public class UnmodifyableList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		List<Integer> unmodList = Collections.unmodifiableList(list);
		for (Integer integer : unmodList) {
			System.out.println(integer);
		}
		
	}
}
