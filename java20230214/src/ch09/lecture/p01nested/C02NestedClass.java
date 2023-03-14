package ch09.lecture.p01nested;

public class C02NestedClass {

}

class MyClass02{
	class Nested02{
		
	}
	Nested02 item = new Nested02(); //클래스 안에선 이렇게 쓸수 있다
	
	void method1() {
		Nested02 local = new Nested02();
	}
}