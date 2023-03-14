package ch09.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
		MyClass01 o1 = new SubClass01();//이과정이 생략된다 
		//anonymous class 상속 인스턴스가 생략되고 바로 생성됨
		//다음 파일로...
	}
}
class MyClass01{
	
}

class SubClass01 extends MyClass01{
	
}