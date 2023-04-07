package ch12.lecture.p06annotation;

public class C07Annotation {
	public static void main(String[] args) {
		
	}
}


class Myclass07 {
	@MyAnnotation07(value = "hello")
	String field;
	@MyAnnotation07("greeting") //value 생략이 가능하다
	String field2;
	@MyAnnotation07("hi")
	String field3;
}

@interface MyAnnotation07 {
	String value();
}
