package ch09.lecture.p02anonymous;

public class C08Anonymous {
	public static void main(String[] args) {
		MyInterface08 o1 = new MyInterface08() {
			//따로 클래스 안만들고 이렇게 아나니머스로 바로 가능
			@Override
			public void method1() {
				System.out.println("메소드 재정의!!");
			}
		};
		o1.method1();
	}
}

interface MyInterface08{
	void method1();
}