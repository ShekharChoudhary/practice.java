package practice.java.interfaces;

public class InterfaceTestClass implements FirstInterface,SecondInterface{

	
	public static void main(String[] args) {
		System.out.println(FirstInterface.x);
		System.out.println(SecondInterface.x);
		
	}
}

interface FirstInterface {
	int x = 25;
}

interface SecondInterface{
	int x = 30;
}
