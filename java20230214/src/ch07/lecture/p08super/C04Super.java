package ch07.lecture.p08super;

public class C04Super {

}
class Super04 {
	public void method1() {
		
	}
	public void method3() {
		
	}
}
class Sub04 extends Super04 {
	@Override
	public void method3() {
		method1();
		method3();//이건 자기 자신을 호출하는거 
				//그럼 super의 method3을 호출하고 싶으면?
		super.method3();//super가 부모클래스를 명시하는거임
	}
	public void method2() {
		method1();
	}
}
