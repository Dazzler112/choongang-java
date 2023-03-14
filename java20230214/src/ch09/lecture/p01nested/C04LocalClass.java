package ch09.lecture.p01nested;

public class C04LocalClass {
	void method1() {
		//로컬 클래스 (local class)
		//선언된 메소드 내에서만 사용 가능
		class LocalClass1{
			//여기서 선언 됬으니 method2에서 사용불가
		}
		LocalClass1 o1 = new LocalClass1();
		//나머지는 평소 쓰던대로 쓰면 된다
		//근대 왜 이렇게씀? -> 여기서만 쓰고 다른대 쓸일 없을때
	}
	void method2() {
		LocalClass1 o1 = new LocalClass1(); //xx 로컬클래시는 다른곳에 선언 불가
	}
}
