package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03{
	//method1 , method2 상속받음
	//이거 어쩔수 없이 계속 써야함?
	//ㄴㄴ 바꿀수있음
	
	//상속받은 메소드는 재정의(Override) 가능
	
	//method2 재정의
	public void method2() {
		System.out.println("서브클래스 메소드3");
	}
	
	public void method3() {
		System.out.println("서브클래스 메소드3");
	}
}
