package practice.java.basic;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsTest {

	public static void main(String[] args) {
		ExceptionsTest t = new ExceptionsTest();
		t.testAge(14);
	}
	
	public void testAge(int age){
		if(age<18){
			try {
				throw new MyException("age is less than 18");
			} catch (MyException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public void test() throws FileNotFoundException, NumberFormatException{
		try{
			int x =0;
			System.exit(0);
		}finally{
			System.out.println("this is exception test");
		}
	}
}
