package ch08.lecture.p05cast;
//강제 형 변환
public class C01Cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass011();
//		o1.method1(); //xx
		
		MyClass011 o2 = (MyClass011) o1;//강제형변환 코드는 강제종료될 위험이 크다
		
		o2.method1();
	}
}
