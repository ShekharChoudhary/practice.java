package practice.collections;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		/*
		 * In a treemap or a treeset the value is not modified based on Hashcode or equals
		 * but based on the comparator on the key object.
		 * Also if there is a match then only the value is replaced and not the key. 
		 */
		TreeMap<Employee, Integer> map = new TreeMap<>();
		map.put(new Employee("Shekhar",1),1);
		map.put(new Employee("Vijay",3),3);
		map.put(new Employee("Shankar",2),2);
		map.put(new Employee("Nishant",4),4);
		//In this case the Key is not replaced but only the value.
	System.out.println(map.put(new Employee("Shekhar",5),5));	 
		
		for (Employee emp : map.keySet()) {
			System.out.println(emp +"  "+map.get(emp));
		}
		
		/*TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Shekhar", 1);
		map.put("Shankar", 2);
		map.put("Vijay", 3);
		map.put("Shekhar", 5);
		
		for (String string : map.keySet()) {
			System.out.println(string+" : "+map.get(string));
		}*/
	}
}
