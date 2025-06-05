package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] prod = makeProductList();
		
		System.out.println("---商品リスト---");
		System.out.println();
		displayProductList(prod);
		
		Deliverable[] deliv = getDelivarable(prod); 
		System.out.println("---配送可能商品---");
		System.out.println();
		displayDelivList(deliv);

	}
	
	public static AbsProduct[] makeProductList() {
		AbsProduct[] prod = {
			new LimitedProduct("マウス", 2000, 10),
			new SpecialProduct("特化キーボード", 3600, 4500),
			new LimitedProduct("Webカメラ", 3900, 7),
			new NormalProduct("マイク",2800),
			new SpecialProduct("ディスプレイ", 15000, 20000),
			new NormalProduct("LED照明", 4200)
		};
		
		return prod;
	}
	
	public static void displayProductList(AbsProduct[] absProd) {
		for(int i = 0; i < absProd.length; i++) {
			absProd[i].display();
			System.out.println();
		}
	}
	
	public static Deliverable[] getDelivarable(AbsProduct[] prod) {
		Deliverable[] deliv = new Deliverable[prod.length];
		int dCnt = 0;
		for(int i = 0; i < prod.length; i++) {
			if(prod[i] instanceof Deliverable) {
				deliv[dCnt] = (Deliverable) prod[i];
				dCnt++;
			}
		}
		return deliv;
	}
	
	public static void displayDelivList(Deliverable[] deliv) {
		for(int i = 0; i < deliv.length; i++) {
			if (deliv[i] == null) {
				break;
			}
			System.out.println();
			deliv[i].displayDeliv();
		}
	}
	

}
