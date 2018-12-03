package practice.collections;

public class Student {

	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name +" : "+id;
	}

	@Override
	public int hashCode() {
/*		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;*/
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
/*		if (id != other.id)
			return false;*/
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
