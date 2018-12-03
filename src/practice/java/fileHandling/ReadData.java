package practice.java.fileHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReadData {
	
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		ListIterator<String> itr = list.listIterator();
				
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		list.add(2, "C");
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
		
	}
	
}

