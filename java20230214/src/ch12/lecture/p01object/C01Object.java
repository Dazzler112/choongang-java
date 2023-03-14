package ch12.lecture.p01object;

import java.util.*;

public class C01Object {
		//object
		//모든 클래스의 상위 클래스
	public static void main(String[] args) {
		String s1 = "java";
		Object o1 = s1;
		
		Scanner sc = new Scanner("");
		Object o2 = sc;
		
		ArrayList list = new ArrayList();
		Object o3 = list ;
		
		C01Object o4 = new C01Object();
		Object o5 = o4;
		Object o6 = new MyClass01();
		
		
		//Object 다 된다 클래스의 최상위이다(심지어 만든 클래스도 포함이다)
		
		//심지어 기본타입도 Object이다.
		int i = 3;
		Object o7 = i;//이게 왜 됐는지는 나중에...설명...
	}

}

//extends Object가 생략되있다
class MyClass01{}