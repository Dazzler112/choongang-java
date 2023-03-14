package ch13.lecture.p02wildcard;

import ch09.lecture.p01nested.*;

//이해 못해서 다시 02에서 설명 Number로
public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>(); //하위타입이 Number 또는 하위타입이겠구나
		MyClass03 <?super Number> o2 = new MyClass03<Object>();
		o1.item = new Number();//됨 (추상 클래스여서 인스턴스화 못함)
		o1.item = new Integer(0); //oo T는 넘버의 슈퍼타입중 하나니까 Number 또는 object겠구나 그럼 그하위타입은 다된다
		o1.item = new Object();//xx
		
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		Number n1 = o4.item; //ok Number 또는 하위타입이 되겠네
		Object o5 = o4.item; //ok
		Integer i1 = o4.item;//int 안되니까 integer로 포장해서 받는건 안전하냐? XX number 또는 하위타입인대 integer라고 안심하겠냐?
		
		
	}
}

class MyClass03 <T>{
	public T item;
}