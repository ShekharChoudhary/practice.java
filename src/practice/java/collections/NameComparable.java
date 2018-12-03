package practice.java.collections;

import java.util.Comparator;

public class NameComparable implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
