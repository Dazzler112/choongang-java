package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		SuperClass01 o2 = o1;
		
		o2.method();//재정의 하지 않았으니 super method1이 출력됨
		o1.method();//재정의하면 submethod1이 출력된다
		//실제 중요한건 타입이 아니라 실제 인스턴스가 중요하다
	}
}

class SuperClass01{
	public void method() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01{
	@Override
	public void method() {
		System.out.println("sub method1");
	}
} 