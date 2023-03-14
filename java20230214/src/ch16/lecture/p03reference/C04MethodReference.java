package ch16.lecture.p03reference;

public class C04MethodReference {
	public static void main(String[] args) {
		//인스턴스 메소드 참조
		//Reference to an instance method
		//of an arbitrary object of a particular type
		MyIterface05 o1 = (a, b) -> a.method(b);//첫번째 파라미터의 메소드에(a.) 두번째 파라미터에 생성자를 넣으면 줄일수 있겠느냐? 
		MyIterface05 o2 = MyClass04::method;
	}
}


interface MyIterface05 {
	void action(MyClass04 a, int b);
}


class MyClass04 {
	void method(int a) {
		
	}
}
