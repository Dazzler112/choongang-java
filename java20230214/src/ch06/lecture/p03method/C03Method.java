package ch06.lecture.p03method;

public class C03Method {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03();
		
		o1.greeting();
		o1.name ="son";
		o1.greeting();
		
		o2.greeting();
		o2.name = "kim";
		
		o1.greeting(); //메소드만 호출 했는대 field도 호출 했더라
		o2.greeting();//서로 다른 속성이여서 다름
	}
}
