package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
//		MyClass02<Object> o1 = new MyClass02<String>();//xx
		//값이 나갈때 (out) super
		MyClass02<? super String> o1 = new MyClass02<String>(); //1-2
//		o1.item = new String();//o1 아이템에 스트링을 넣고 싶은대 인스턴트 조자 안된다
		//하려면 스트링의 상위타입이기만 하면 된다 1-1
		o1.item = new String();//1-3 String 또는 그 하위 타입 대입 가능
		
		//대입 가능한대 꺼내고 싶다
		String s1 = o1.item; //String에 할당 불가
		//지금 인스턴스 한게 String 의 상위타입이니까 꺼내는건 안됨
		
		//값이 들어올때(in) extends
		MyClass02<? extends String> o2 = new MyClass02<String>(); //나는 꺼내는 타입을 쓰고 싶다
		o2.item = new String();//String 또는 그 하위타입을 대입 불가능
		String s2 = o2.item; //위의 인스턴스가 String의 하위타입이니까 꺼내는거 가능
	}
}

class MyClass02<T> {
	public T item;
}
