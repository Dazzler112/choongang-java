package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		//파라미터가 없으면 빈 ()
		//메소드 body는 {}
		MyInterface02 o1 = () -> {
			//메소드 body
			System.out.println("메소드 body 작성");
		};
		o1.method();
		
		//메소드의 명령문이 하나이면 중괄호 생략 가능
		MyInterface02 o2 = () -> {//2개 이상이면 중괄생략 X
			System.out.println("명령문이 여러개1");
			System.out.println("명령문 여러개2");
		};
		
		//명령문 1개 중괄호 생략 (람다에서는 생략 가능하면 생략! why?)
		//lambda는 생략할 수록 읽기 쉽기 때문
		MyInterface02 o3 = () -> System.out.println("명령문 하나");
	}
}

@FunctionalInterface
interface MyInterface02{
	//파라미터가 없는 추상 메소드
	void method();
}
