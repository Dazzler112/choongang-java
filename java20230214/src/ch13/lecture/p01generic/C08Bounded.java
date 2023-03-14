package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o2.handleItem();
		
		
		//String은 Number다 라고 할수 없기 때문
//		MyClass08<String> o3 = new MyClass08<>("java"); //XX
	}
}

//bounded type parameter //상한선이 있는 파라미터
class MyClass08 <T extends Number>{//<-넘버의 하위타입만 가능
	private T item;
	
	public MyClass08(T item) {
		this.item = item;
	}

	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		//item이 Number 또는 그 하위타입이므로
		//Number의 메소드를 실행 할 수 있음
		int i = item.intValue();
		double d = item.doubleValue();

		/*
		if (item instanceof Number numItem) {
			int i = numItem.intValue();
			double d = numItem.doubleValue();
		}	*/
	}

	
}
