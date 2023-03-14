package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();//전에 타입파라미터 할때는 인스턴스때 해줬는대 
									//메소드에 있으니 지금 하지 않음
		o1.<String>method("java");
		o1.<Integer>method(9);
		//하지만 99.9% 쓸일이 없을거다
		
		o1.method("spring");
		o1.method(99); //이런식으로도 가능한대?
	}
}

class MyClass05{
	
	//generic method
	public <T> void method(T t) {
		
	}
}