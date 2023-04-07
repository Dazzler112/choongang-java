package ch12.lecture.p06annotation;

public class C06Annotation {
	public static void main(String[] args) {
		
	}
}


class MyClass06 {
	@MyAnnotation06
	String field1;
	
	@MyAnnotation06(myAttr = 10)//값을 줄수도 있다 안주면 아래값 그대로 0임
	int field2;
	
	@MyAnnotation06(myAttr = 20)
	boolean field3;
}

@interface MyAnnotation06{
	int myAttr() default 0;
}
