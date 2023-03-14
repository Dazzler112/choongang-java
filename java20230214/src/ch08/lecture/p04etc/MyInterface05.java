package ch08.lecture.p04etc;

public interface MyInterface05 {
	//public static final field
	
	//public method
	static void method1() {
		common(); //공통된코드 호출하자
		System.out.println("공통된 코드");
		System.out.println("method1 code..");
	}
	static void method2() {
		common();
		System.out.println("공통된 코드");
		System.out.println("method2 code..");;
	}
	//private static method
	private static void common() {
		System.out.println("공통된 코드");
	}
	
	
	//public abstract instance method
	//public default instance method
	//private instance method
}
