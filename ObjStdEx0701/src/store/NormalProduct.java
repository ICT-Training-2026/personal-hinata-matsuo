package store;

public class NormalProduct extends AbsProduct implements Deliverable {
	public NormalProduct(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void display() {
		System.out.println(getNameAndPrice());
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【*特別送料500円*】" + getNameAndPrice());
	}
}
