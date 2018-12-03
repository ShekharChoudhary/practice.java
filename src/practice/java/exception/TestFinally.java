package practice.java.exception;

public class TestFinally {

	public static void main(String[] args) {
		TestFinally test = new TestFinally();
		try {
		   System.out.println(test.test());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public int test() throws Exception{
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("first exception");
			throw new Exception();
		}finally {
			return 10;
		}
		
		
	}
}

