package ch12.lecture.p01object;

import java.util.*;

public class C02Object {
	public static void main(String[] args) {
		
	
	//따라서 Object에 있는 메소드는 모든 클래스가 가지고 있다.
	String s = "java";
	s.toString();
	s.hashCode();
	s.equals(""); //모두다 있다
	
	Scanner sc = new Scanner("");
	sc.toString();
	sc.hashCode();
	sc.equals(null);
	
	MyClass02 o1 = new MyClass02(); 
	o1.toString();
	o1.hashCode(); //우리가 클래스 선언하면서 직접 만들지도 않았는대
	o1.equals(null); //모두 다 있다 Object 갖고 있는메소드는 전부 사용 가능하다 
				//최상위가 object인놈이면..
	}
}

class MyClass02{}
