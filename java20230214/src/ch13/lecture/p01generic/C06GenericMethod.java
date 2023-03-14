package ch13.lecture.p01generic;
//return타입
public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		o1.<Integer>method();
		o1.<Integer>method();//이런식으로 거의 안쓴다
		
		String s1 = o1.<String>method();
		Integer s2 = o1.<Integer>method();//값때문에 유추할수 있기 때문에 안쓴다
		
		
		//이런식으로 쓸수 있어서 안씀
		String s3 = o1.method();
		Integer s4 = o1.method();
		
		
	}
}

class MyClass06{
	public <T> T method() {
		return null; //리턴타입으로 받기위해 사용
	}
}