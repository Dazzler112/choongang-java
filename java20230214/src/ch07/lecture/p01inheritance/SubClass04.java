package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04{
	//재정의 할 목적으로 썼음
	
	//SuperClass04  method1재정의
	@Override //재정의 메소드인지 컴파일러가 검증
	public void metohd1() {//오타가 나버림 검증 받는 코드가 있다
		//@Override 이거 사용하면 옆에 컴파일러 오류 나옴
		System.out.println("sub method1");
	}
	@Override
	public void method1() {
		System.out.println("sub method1");
	}
	@Override//어노테이션(annotation) //만드려는 부분 ctrl + spacebar 누르고 찾으면 자동 작성됨
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("sub method2");
	}
}
