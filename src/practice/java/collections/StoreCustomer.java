package practice.java.collections;

import java.util.*;

public class StoreCustomer {

	public static void main(String[] args) {

		TreeSet<Customer> hm= new TreeSet<>();
		
		hm.add(new Customer("rahul", 004));
		hm.add(new Customer("prajjal", 006));
		hm.add(new Customer("shekhar", 003));
//		hm.put(new Customer("Rahul", 001), 	"234");
//		System.out.println(hm);
		for(Customer x : hm){
			System.out.println(x.getName());
		}
		
		
		
	}

}
