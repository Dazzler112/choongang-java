package ch08.lecture.p03polymorphism;
	//return에서의 사용법
public class C06Polymorphism {
	public static void main(String[] args) {
		Myinterface06 o1 =  method(); 
		//return에도 사용 가능
	}
	public static Myinterface06 method() {
//		return new MyClass06(); 둘다 된다
		return new MyClass07();
	}
}

interface Myinterface06 {}

class MyClass06 implements Myinterface06 {}
class MyClass07 implements Myinterface06 {}
