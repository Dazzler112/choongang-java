package ch16.lecture.p02lambda;
//추상메소드 2개이상이면 람다식 생성 불가
public class C01Lambda {
	public static void main(String[] args) {
	//functional interface로 lambda식 만들 수 있음.
		MyInterface01 o1 = () -> System.out.println("재정의 메소드@");
		MyInterface01 o2 = () ->System.out.println("또다른 메소드@");
		o1.method1();
		o2.method2();
	}
}
//lambda expression
//추상 메소드가 하나인 interface의 익명클래스 객체 만드는 코드

//functional interface : 추상 메소드가 하나인 interface

@FunctionalInterface //<-검증 하는법 //써도 되고 안써도 됨
interface MyInterface01 {//다른 메소드 있던 없던 추상메소드가 1개면 functional interface임
	void method1();
	
	//Object에 있는 메소드는 추상메소드 수에 포함 안됨
	String toString(); //<-이것도 추상메소드 지만 포함이 안된다
	
	default void method2() {
		
	}
	static void method3() {
		
	}
}

