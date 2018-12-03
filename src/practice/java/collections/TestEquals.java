package practice.java.collections;

import java.util.*;

public class TestEquals {
	
	public static void main(String[] args) {
		TreeMap<Student, String> student = new TreeMap<>();
		student.put(new Student("ram",001), "delhi");
		student.put(new Student("abhishek",002), "mumbai");
		student.put(new Student("shyam",003), "pune");
		student.put(new Student("mohan",004), "bangalore");
		student.put(new Student("sohan",005), "bhagalpur");
		
		for(Student x : student.keySet()){
			System.out.println(x.getName());
		}
		
	}
}
