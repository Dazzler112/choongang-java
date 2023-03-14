package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();//1-2
		MyClass01.Nested01 o2 = o1.new Nested01();//이런식으로1-2 //이거 거의 안쓴다
	}
}

//중첩 클래스 (nested class)
class MyClass01{
	//class
	class Nested01{//Myclass01을 인스턴스 화 먼저 하고 해야 사용 가능하다 1-1
		//필드
		//생성자
		//메소드
	}
	
	//필드
	//생성자
	//메소드
}