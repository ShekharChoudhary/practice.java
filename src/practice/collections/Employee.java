package practice.collections;

public class Employee implements Comparable<Employee>{

	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name : "+name+" id : "+id;
	}

	@Override
	public int compareTo(Employee o) {
		
		return o.name.compareTo(name);
	}
}
