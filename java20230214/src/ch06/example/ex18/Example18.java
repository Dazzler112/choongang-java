package ch06.example.ex18;

public class Example18 {
	public static void main(String[] args) {
		ShopService obj1 =  ShopService.getInstance();
		ShopService obj2 =  ShopService.getInstance();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
