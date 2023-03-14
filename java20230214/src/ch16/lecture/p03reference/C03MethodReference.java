package ch16.lecture.p03reference;

public class C03MethodReference {
	public static void main(String[] args) {
		//인스턴스 메소드 참조
		//Reference to an Interface...sadsadsadsfsfc
		MyInterface04 o1 = a ->System.out.println(a); //어떤일을 하겠다...
		
		MyClass03 s1 = new MyClass03();
		//첫번째 파라미터(a)와 생성자의 a 가 같으면 줄일수 있겠느냐?
		MyInterface04 o2 = a -> s1.method(a); //인터페이스가 단순한 호출에 불과하다면
		MyInterface04 o3 = s1::method; //인스턴스 메소드 불러오기
		
		MyInterface02 o4 = () -> s1.method1();
		MyInterface02 o5 = s1::method1;//위와 같다
		
		MyInterface03 o6 = (a, b) -> s1.method2(a, b);
		MyInterface03 o7 = s1::method2;
		
		MyInterface03 o8 = (a, b) -> s1.method2(b, a);//참조 못만듬? 뭔말이야 시발
	}
}

interface MyInterface04 {
	void action(int a);
}

class MyClass03{//인스턴스메소드
	void method1() {//파라미터 X
		
	}
	void method2(int a , int b) {//파라미터 2개
		
	}
	void method(int a) {
		
	}
}