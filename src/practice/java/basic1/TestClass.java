package practice.java.basic1;

import java.io.File;
import java.util.TreeSet;

public class TestClass {
	
	public static void main(String[] args) {
		int x =0;
//		assert (x>0) ? "Assert failed" : "Assert passed";
		
		TreeSet t = new TreeSet();
		File f = new File("test");
		f.delete();
	}
}
