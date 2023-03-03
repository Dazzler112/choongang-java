package ch06.example.ex18;

public class ShopService {
	//1 접근 못하게 제한
	private ShopService() {
		
	}
	private static ShopService ins = new ShopService();
	
	//2.그다음 내부에서 접근 가능하게 만들어줌
	public static ShopService getInstance() {
		if(ins == null) {
			ins = new ShopService();
		}
		return ins;
	}
}
