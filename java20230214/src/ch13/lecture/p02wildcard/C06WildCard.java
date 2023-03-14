package ch13.lecture.p02wildcard;

public class C06WildCard {
	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<Object>();
		MyClass06<Object> o2 = new MyClass06<String>();//x
		//상하위 타입 모두 받고 싶을때가 있다
		MyClass06<?> o3 = new MyClass06<Object>(); //잘쓰진 않음
		MyClass06<?> o4 = new MyClass06<String>(); //그냥 하나 남은거여서 알려줌
		
		MyClass06 o5 = new MyClass06();
	}
}
class MyClass06 <T>{
	public T item;
}