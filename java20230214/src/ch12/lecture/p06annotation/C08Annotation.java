package ch12.lecture.p06annotation;

public class C08Annotation {
	public static void main(String[] args) {
		
	}
}


class MyClass08 {
	@MyAnnotation08
	int f1;
	@MyAnnotation08(100)//하나의 값엔 생략 가능하지만
	int f2;
	@MyAnnotation08(value = 100)
	int f3;
	@MyAnnotation08(value = 100, name ="lee")//이렇게 여러개 값 넣을때 생략 불가능
	int f4;
}

@interface MyAnnotation08{
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}