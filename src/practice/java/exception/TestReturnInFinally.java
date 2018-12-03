package practice.java.exception;

public class TestReturnInFinally {


	public static void main(String[] args) {
		TestReturnInFinally test = new TestReturnInFinally();
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
			return 20;
		}finally {
			return 10;
		}
		
		
	}


}
