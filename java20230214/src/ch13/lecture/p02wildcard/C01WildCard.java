package ch13.lecture.p02wildcard;
//좀 내용이 어렵고 지루하다
public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<>();
		
		o1.item = new Object();
		o2.item = new String();
		
		o1.item = new String(); //o
//		o2.item = new Object();	//x
		
//		MyClass01<Object> o3 = o2; //x
//		o3.item = new Object();  //이렇게 안될때 사용할수 있게 하는게 wildcard
	}
}
class MyClass01<T> {
	public T item;
}