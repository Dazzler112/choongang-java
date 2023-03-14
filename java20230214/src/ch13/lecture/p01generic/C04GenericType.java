package ch13.lecture.p01generic;

public class C04GenericType {
	public static void main(String[] args) {
		MyClass04<String, Integer> o1 = new MyClass04<>();
		o1.setItem("hello");
		o1.setItem2(99);
		
		String s1 = o1.getItem();
		int s2 = o1.getItem2();
		
		MyClass04<String, String> o2 = new MyClass04<>();
		MyClass04<Integer,String> o3 = new MyClass04<>();
	}
}

			//2개도 사용 가능하다
class MyClass04<T, U> {//<첫번째, 두번쨰>
	private T item;
	private U item2;//같은타입이면 T쓰면되는대 다른타입으로 하고싶다 하면
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	} 
	
}