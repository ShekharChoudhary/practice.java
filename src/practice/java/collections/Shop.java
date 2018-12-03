package practice.java.collections;

public class Shop {

	private int shopId;
	private String name;
	
	public Shop(int shopId, String name){
		this.shopId = shopId;
		this.name = name;
	}
	public int getShopId() {
		return shopId;
	}
	public String getName() {
		return name;
	}
	
	public String toString(){
		return "Shop Id : "+shopId+" Shop Name : "+name;
	}
}
