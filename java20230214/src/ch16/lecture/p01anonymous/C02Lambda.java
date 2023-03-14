package ch16.lecture.p01anonymous;
//람다식은 줄일수록 더 편함
//인터페이스를 구현한 클래스에 
public class C02Lambda {
	public static void main(String[] args) {
		MyInterface02 o1= () -> System.out.println("재정의한 메소드");
		o1.method1();
	}
}
//new MyInterface02() {
//@Override
//public void method1{} <-이부분이 다 생략 1줄이면 중괄호도 생략

interface MyInterface02{
	void method1();
}
