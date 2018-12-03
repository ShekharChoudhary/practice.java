package practice.collections;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<>();
		
		map.put(new Student("Shekhar",1), 1);
		map.put(new Student("Shankar",2), 2);
		/*
		 * In this case only the value is replaced and not the key.
		 * Hence the output will be :-
		 *  Shekhar : 1  3
         *  Shankar : 2  2
         *  We see here that the key is still the same but only value changes
		 */
		map.put(new Student("Shekhar",3), 3);
		
		for (Student student : map.keySet()) {
			System.out.println(student+"  "+map.get(student));
		}
	}
}
