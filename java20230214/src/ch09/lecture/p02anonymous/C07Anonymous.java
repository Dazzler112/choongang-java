package ch09.lecture.p02anonymous;

public class C07Anonymous {
	public static void main(String[] args) {
		MyInterface07 o1 = new MyClass07();
		//interface를 인스턴스화 하고 싶으면 클래스 만들어서 해야한다
		//why? interface는 인스턴스화 불가하니까
		o1.method1();
	}
}

class MyClass07 implements MyInterface07 {
	@Override
	public void method1() {
		System.out.println("재정의된 메소드");
	}
}
interface MyInterface07 {
	abstract void method1();
}
