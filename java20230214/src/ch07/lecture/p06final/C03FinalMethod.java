package ch07.lecture.p06final;

public class C03FinalMethod {

}
class Super03{
	//final method는 재정의 할수 없다
	final public void method1() {	
	}
	public void method2() {
		
	}
}
class Sub03 extends Super03 {
	@Override
	public void method1() {
		System.out.println("재정의");
	}
}