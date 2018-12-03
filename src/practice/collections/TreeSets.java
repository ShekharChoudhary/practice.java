package practice.collections;

import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<>();
		set.add(new Employee("Shekhar",1));
		set.add(new Employee("Vijay",3));
		set.add(new Employee("Shankar",2));
		set.add(new Employee("Nishant",4));
		set.add(new Employee("Shekhar",5));
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}
}
