package ch06.lecture.p11capsule;

public class C01Encapulation {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
//		o1.age = 3;
//		o1.age = -1
		//작성자의 실수를 좀 방지하고싶다 바로접근 못하게 하겠다 myclass01로
		
		o1.setAge(3);
		o1.desc();
		o1.setAge(-1);
		o1.desc();
	}
}
