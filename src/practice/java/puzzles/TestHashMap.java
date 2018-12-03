package practice.java.puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TestHashMap {

	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Shekhar");
		Employee e2 = new Employee(1,"Shekhar");
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(e1, 1);
		System.out.println(map.get(e1));
//		e1.name = "Shankar";
		System.out.println(map.get(e2));
		
	}
}

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}
}
