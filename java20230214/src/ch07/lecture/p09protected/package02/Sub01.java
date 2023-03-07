package ch07.lecture.p09protected.package02;

import ch07.lecture.p09protected.package1.*;

public class Sub01 extends Super01 {
	public void method2() {
		method1(); //된다
		this.method1();//상속 받았기 때문에 접근및 호출 가능
		super.method1();
	}
	public void method3() {
		Super01 o1 = new Super01();
		o1.method1();//인스턴스 접근은 다른 패키지여서 안됨
	}
}
