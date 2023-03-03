package ch06.lecture.p04static;

public class MyClass01 {
	//static 설명 전 기존 인스턴스 멤버 설명 
	//instance field
	String name;
	int age;
	
	//instance method
	void greeting() {
		System.out.println(age +"살" + name + "입니다.");
	}
}
