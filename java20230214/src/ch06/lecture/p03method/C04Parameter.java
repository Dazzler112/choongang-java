package ch06.lecture.p03method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method1();
		
		//메소드실행시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		//아규먼트 입력(전달)
//		o1.method1(3);//안됨
		
		o1.method2(5);;//인티저 값에 맞게 파라미터 넣어줘야함
		//o1.method2();//안됨
		
		o1.method3("hello"); //직접 써줘도 되고
		String s1 = "java"; //변수에 값넣어서
		o1.method3(s1); //변수 넣어줘도 되고
		o1.method3(null);
		String s2 = null;
		o1.method3(s2);
		
		int i1 = 1;
		o1.method4(i1,3);
		
		o1.method5("hi", s1);
		
		o1.method6(3, "A");
		
		o1.method7(s2, i1);
	}
}
