package store;

public abstract class AbsProduct {
	private String name;
	private int price;
	
	protected AbsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//抽象メソッド
	public abstract void display();
	
	protected String getNameAndPrice() {
		return name + "：" + price + "円";
	}
}
