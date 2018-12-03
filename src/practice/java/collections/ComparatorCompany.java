package practice.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorCompany {

	public static void main(String[] args) {
		ArrayList<Company> c = new ArrayList<>();
		c.add(new Company("rahul", 10));
		c.add(new Company("amit", 10));
		c.add(new Company("javed", 10));
		c.add(new Company("c", 10));
		c.add(new Company("sam", 10));
		c.add(new Company("asdf", 10));
		
		Collections.sort(c, new CompanyNameSort());
		
		for(Company x : c){
			System.out.println(x.name);
		}
		
		
	}
}
