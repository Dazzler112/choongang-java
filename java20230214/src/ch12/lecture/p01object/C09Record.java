package ch12.lecture.p01object;
//자바 13부터 사용 가능이여서 많이 안쓰고 있지만 언젠가는 많이쓸거 같다.
public class C09Record {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09("son", 33);
		System.out.println(o1);
		System.out.println(o1.name());
		System.out.println(o1.age());
	}	
}
record MyClass09 (String name, int age) {
	
}
