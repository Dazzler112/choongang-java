package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass04;

public class C04Import {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		
		//이름이 이렇게 같을경우 풀네임을 써줘야한다
		ch06.lecture.p09package.package2.MyClass04 o2 = new ch06.lecture.p09package.package2.MyClass04();
	}
}
