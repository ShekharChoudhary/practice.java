package practice.java.basic;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	
	public Student (String name, int id){
		this.name = name;
		this.id = id;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	public String toString(){
		return name +" "+id +"\n";
	}
	@Override
	public int compareTo(Student o) {
		if(o.getId()%2==0){
			return 1;
		}else if(o.getId()%2!=0){
			return -1;
		}
		return 0;
	}
	
}
