package store;

public class LimitedProduct extends AbsProduct {
	private int dayCnt;
	
	public LimitedProduct(String name, int price, int dayCnt) {
		super(name, price);
		this.dayCnt = dayCnt;
	}
	
	public int minusDayCnt(int minus) {
		return dayCnt -= minus;
	}
	
	@Override
	public void display() {
		System.out.println(getNameAndPrice() + "(配送不可)(残り:" + dayCnt + "日)");
	}
}
