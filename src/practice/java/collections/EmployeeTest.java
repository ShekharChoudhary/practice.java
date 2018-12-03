package practice.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Shekhar", 001));
		emp.add(new Employee("Amit", 016));
		emp.add(new Employee("Shankar", 003));
		emp.add(new Employee("Nishant", 004));		
		
		Collections.sort(emp,new EmpIdComparator());
		for(Employee x : emp){
			System.out.println(x.getEmpId());
		}
		System.out.println("*******************");
		Collections.sort(emp, new NameComparable());
		for(Employee y : emp){
			System.out.println(y.getName());
		}
		
	}
}
