package practice.java.basic;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>();
		
		set.add(new Student("aaa",215));
		set.add(new Student("aaaaaaaa",216));
		set.add(new Student("aaaa",214));
		set.add(new Student("a",212));
		set.add(new Student("aa",213));
		set.add(new Student("aaaaaa",217));
		set.add(new Student("aaaaa",218));
		set.add(new Student("aaaaaaa",219));
		System.out.println(set);
	}
}
