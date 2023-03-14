package ch08.lecture.p04etc;

public interface MyInterface01 {
	void method1();
	//default method : interface의 구현된 메소드
	//접근제한자 생략하면 public
	default void method2() {//몸통이있는 매소드는 꼭 앞에 default 명시
		System.out.println("interface의 default method");
		System.out.println("body가 있는 메소드");
	}
}
