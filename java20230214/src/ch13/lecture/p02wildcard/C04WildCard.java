package ch13.lecture.p02wildcard;

public class C04WildCard {
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
	}
	//<? extends XXX> 은 여기(XXX)서 뭘 꺼내겠구나 생각하자 뭘 완벽하게 알아서 하려고 할 생각 아직X 나중에 숙달 되면 깨닫기
	public static void printItem(MyClass04<? extends Number> param) {
		//in
		Number num = param.getItem();
		System.out.println(num.doubleValue() * num.doubleValue());
	}
}

class MyClass04 <T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
