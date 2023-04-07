package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {
		
	}
}

@MyAnnotation03
class MyClass03 {
	
	@MyAnnotation03
	String field;
	
	@MyAnnotation03
	MyClass03(){
		
	}
	
	@MyAnnotation03
	void method1(){
		
	}
}


@Target(ElementType.FIELD)//어노테이션 하고싶은대에만 설정해 주고 싶을때
@Retention (RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {}

