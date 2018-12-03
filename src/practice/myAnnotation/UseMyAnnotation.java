package practice.myAnnotation;

public class UseMyAnnotation {

	public static void main(String[] args) {
		
		AnnotationTest1 test = new AnnotationTest1();
		test.run();
	}
}

@RunAtStartup(priority = 0, method="test")
class AnnotationTest1 {
	
	public void test() {
		System.out.println("This is test method of AnnotationTest1");
	}
	
	public void run() {
		System.out.println("This is run method");
	}
	
}