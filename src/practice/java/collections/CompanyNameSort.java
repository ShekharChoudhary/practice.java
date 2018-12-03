package practice.java.collections;

import java.util.Comparator;

public class CompanyNameSort implements Comparator<Company> {

	@Override
	public int compare(Company o1, Company o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
