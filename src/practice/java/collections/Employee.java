package practice.java.collections;

public class Employee {

	private String name;
	private int empId;
	
	public Employee(String name, int empId){
		this.name = name;
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
