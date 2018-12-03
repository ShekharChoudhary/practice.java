package practice.java.collection;

import java.util.HashMap;

public class HashMapWithEmpKey {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"john");
		Employee e2 = new Employee(101,"john1");
		Employee e3 = new Employee(102,"john2");
		
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 3);
		
		System.out.println(map.get(e1));
		
		
		e1.setSalary(4000);
		
		System.out.println(map.get(e1));
		
	}
}


class Employee{
	int id;
	String name;
	int salary = 10000;
	
	/*public String toString(){
		return "this is employee "+name;
	}*/
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
}