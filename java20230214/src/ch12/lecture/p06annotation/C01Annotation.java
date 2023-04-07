package ch12.lecture.p06annotation;

public class C01Annotation {
	public static void main(String[] args) {
		
	}
}


//이런식으로 annotation을 사용할 수 있다.
@MyAnnotation01
class MyClass{
	@MyAnnotation01
	String field;
	
	@MyAnnotation01
	MyClass(){
		
	}
	
	
	@MyAnnotation01
	void method1() {
		
		@MyAnnotation01
		int var;
	}
	
	void method2(@MyAnnotation01 int param) {
		
	}
}

@interface MyAnnotation01{
	
}
