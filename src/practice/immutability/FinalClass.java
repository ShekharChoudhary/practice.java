package practice.immutability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public final class FinalClass {
	
	private final int id;
	private final String name;
	private final Address address;
	private final List<String> itemList;
	private final HashMap<Integer, String> itemMap;
	
	public FinalClass(int id, String name,Address address, List<String> list, HashMap<Integer, String> map)
	{
		this.id = id;
		this.name = name;
		Address tempadd = new Address();
		tempadd.setAddress1(address.getAddress1());
		this.address = tempadd;
		ArrayList<String> templist = new ArrayList<>();
		for (String string : list) {
			templist.add(string);
		}
		this.itemList = templist;
		HashMap<Integer, String> tempmap = new HashMap<>();
		for (Integer i : map.keySet()) {
			tempmap.put(i, map.get(i));
		}
		this.itemMap = tempmap;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<String> getItemList()
	{
		return (Collections.unmodifiableList(this.itemList));
	}
	
	public HashMap<Integer, String> getItemMap()
	{
		return (HashMap<Integer, String>)itemMap.clone();
		
	}

	public static void main(String[] args) 
	{
		//Modify the code to fit the new conditions
		/*
		int id=100;
		String name = "Vijay";
		List<String> l1 = new ArrayList<String>();
		l1.add("Vijay");
		l1.add("Shailesh");
		
		HashMap<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "Piyush");
		testMap.put(2, "Suyash");
		
		System.out.println("testMap : "+testMap);
		
		FinalClass finalClass = new FinalClass(id, name, l1, testMap);
		System.out.println("id : "+finalClass.getId());
		System.out.println("name : "+finalClass.getName());
		System.out.println("itemList : "+finalClass.getItemList());
		System.out.println("itemMap : "+finalClass.getItemMap());
		
		id=200;
		name = "Vijay1";
		*//**
		 * this will throw java.lang.UnsupportedOperationException
		 *//*
//		List<String> l2 = finalClass.getItemList();
//		l2.add("Nikhil");
		
		HashMap<Integer, String> tmap = finalClass.getItemMap();
		tmap.put(3, "Shekhar");
		
		System.out.println("id after change : "+finalClass.getId());
		System.out.println("name after change : "+finalClass.getName());
		System.out.println("itemMap after change : "+finalClass.getItemMap());
		
	
	*/}
}
