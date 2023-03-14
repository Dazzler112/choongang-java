package ch09.lecture.p02anonymous;

public class C04Anonymus {
	public static void main(String[] args) {
		class SubClass04 extends MyClass04 {
			@Override//재정의
			void method1() {
				System.out.println("재정의");
			}
		}
		MyClass04 o1 = new SubClass04();
		o1.method1();
	}
}

abstract class MyClass04{
	abstract void method1();//하지만 이게있으면 재정의 해야지?
}