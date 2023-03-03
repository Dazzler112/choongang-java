package ch06.sec04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		System.out.println(s1==s2);//false
		
		//참조값 : System.identityHashCode
		System.out.println(System.identityHashCode(s1));//참조값 알고싶다identityHashCode
		System.out.println(System.identityHashCode(s2));//메모리 주소
	}
}
