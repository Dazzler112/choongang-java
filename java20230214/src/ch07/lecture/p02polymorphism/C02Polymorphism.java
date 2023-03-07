package ch07.lecture.p02polymorphism;

public class C02Polymorphism {

	public static void main(String[] args) {
		SubClass02 o1 = new SubClass02();
		
		o1.method1();
		o1.method2();
		
		SuperClass02 o2 = o1;
		o2.method1();//
		o2.method2();//superclass 관점에 subclass에 있는 method2가 있다고 볼수 있겠느냐
	}

}

//상속은 메소드 위주로 볼것
class SuperClass02 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass02 extends SuperClass02{
	public void method2() {
		System.out.println("sub method2");
	}
}
