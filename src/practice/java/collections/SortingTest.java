package practice.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class SortingTest {

	public static void main(String[] args) {
		List<Shop> shopList = new ArrayList<>();
		
		shopList.add(new Shop(001,"shop9"));
		shopList.add(new Shop(004,"shop4"));
		shopList.add(new Shop(002,"shop5"));
		shopList.add(new Shop(005,"shop7"));
		shopList.add(new Shop(003,"shop6"));
		
	
		
		Comparator<Shop> shopIdSort = new Comparator<Shop>() {
			
			@Override
			public int compare(Shop o1, Shop o2) {
				
				return o1.getShopId() - o2.getShopId();
			}
		};
		
		Collections.sort(shopList, shopIdSort);
		
		Comparator<Shop> shopNameSort = new Comparator<Shop>() {
			
			@Override
			public int compare(Shop o1, Shop o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(shopList, shopNameSort);
		
		ListIterator<Shop> itr = shopList.listIterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
