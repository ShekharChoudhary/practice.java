package practice.java.basic1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmpNameInList {

	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Rahul"));
		emp.add(new Employee(1, "Prajjal"));
		emp.add(new Employee(1, "Shekhar"));
		emp.add(new Employee(1, "Aditya"));
		
		Collections.sort(emp, new SortEmpName());
		
		for (Employee employee : emp) {
			System.out.println(employee.name);
		}
	}
	
}
