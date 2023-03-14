package ch16.lecture.p03reference;

public class C05MethodReference {
	public static void main(String[] args) {
		MyInterface06 o1 = (x) -> x.someMethod(); //만약 파라미터가 3개였으면 ()안에 2개가 들어갔을 거임
		MyInterface06 o2 = MyClass06::someMethod;
	}
}

interface MyInterface06{
	void action(MyClass06 o);
}

class MyClass06 {
	void someMethod() {
		
	}
}