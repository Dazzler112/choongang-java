package ch16.lecture.p02lambda;
//이번에는 파라미터 받는 메소드에 대해 알아보자
public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			
			@Override
			public void method(int a) {
				System.out.println("익명 클래스로 재정의");	
				System.out.println("받은 값: " + a);
			}
		};
		o1.method(9);
		
		MyInterface03 o2 = (int a) ->{
			System.out.println("람다로 재정의");
			System.out.println("받은 값: " + a);
		};
		o2.method(10);
		
		//파라미터 하나일때 
		//타입도 생략 가능 하다
		//타입정도는 생략하는게 좋을거 같아 추론 가능하니까//
		MyInterface03 o3 = (a) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		o3.method(20);
		
		//사실 파라미터 하나일때 둥근 괄호도 생략 가능하다
		MyInterface03 o4 = a -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + a);
		};
		o4.method(30);
		
		//파라미터명? 일치하지 않아도 됨
		MyInterface03 o5 = x-> {
			System.out.println("파라미터 명 재정의");
			System.out.println("받은 값: " + x);
		};//근대 보통 같은경우는 파라미터 명 같을거임
		o5.method(40);
		
		MyInterface03 o6 = (x) -> System.out.println("받은 값: " + x);
		//역시나 명령문 하나일때는 중괄호 생략 가능
		o6.method(50);
	}
}

interface MyInterface03{
	void method(int a);
}