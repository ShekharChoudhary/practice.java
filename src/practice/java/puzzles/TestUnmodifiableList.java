package practice.java.puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUnmodifiableList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		List<Integer> newList = Collections.unmodifiableList(list);
		list.add(3);
		newList.size();
	}
}
