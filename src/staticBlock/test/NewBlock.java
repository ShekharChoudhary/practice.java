package staticBlock.test;

public class NewBlock {

  {
		System.out.println("Non static block is initialized");
	}
  
  static{
		System.out.println("Static block is initialized");
	}
}
