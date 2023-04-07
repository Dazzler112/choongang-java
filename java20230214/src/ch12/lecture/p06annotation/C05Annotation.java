package ch12.lecture.p06annotation;

public class C05Annotation {
	public static void main(String[] args) {
		
	}
}



class MyClass05{
	
	@MyAnnotation05(attr = "hello")//부가정보를 이렇게 할 수 있다
	String field1;
	@MyAnnotation05(attr = "greeting")
	int field2;
}


@interface MyAnnotation05{
	//속성(attribute,element)
	String attr();
}
