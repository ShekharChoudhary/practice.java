package practice.java.collections;

public class Customer implements Comparable<Customer>{
private String name;
private int Id;

public Customer(String name,int Id)
{
	
	this.Id= Id;
	this.name= name;
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (Id != other.Id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public String getName() {
	return name;
}

public int getId() {
	return Id;
}

@Override
public int compareTo(Customer o) {
	return -this.name.compareTo(o.name);
}




}
