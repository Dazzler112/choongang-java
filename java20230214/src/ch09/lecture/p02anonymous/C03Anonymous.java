package ch09.lecture.p02anonymous;

public class C03Anonymous {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03() {//상속 받은놈은 추상 메소드 재정의 할 책임을 갖는다
			@Override
			void method1() {
				System.out.println("재정의한 메소드");
			}
		};
		o1.method1(); //=>재정의한 메소드 실행됨
	}//근대 이런건 보통 로컬클래스 안에서 많이 이루어짐 한마디로 이건 로컬클래스
}
abstract class MyClass03 {//추상은 인스턴스 불가
	//하려면 콘크리트 만들고 해야..
	abstract void method1();
}