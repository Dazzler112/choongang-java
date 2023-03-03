package ch06.lecture.p04static;

public class MyClass05 {
	
	//instance field
	String name;
	
	//static field
	static String model;
	
	//인스턴스 메소드에서 스태틱 필드접근 가능할까? o
	//instance method 
	void printName() {
		System.out.println(name);
		System.out.println(model);
	}
	
	
	//static은 instance field는 접근가능할까? x
	//static method
	static void printModel() {
		System.out.println(model);
//		System.out.println(name); //외우진 말아라 이클립스가 알려준다
		//설계도에서 어떤것을 특정할수 없어서
	}
}
