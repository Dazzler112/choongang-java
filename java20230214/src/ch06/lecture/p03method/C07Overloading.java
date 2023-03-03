package ch06.lecture.p03method;

public class C07Overloading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(29834L);
		o1.method1(33,99);
		o1.method1(3,"hello");
		o1.method1("java",9);
		//메소드가 같은대 메소드의 값이 같은가 X 메소드의 파라미터들이 다르다
		//이름만 같지 속성 자체가 다르다 자동형변환도 당연히 됨
	}
}
