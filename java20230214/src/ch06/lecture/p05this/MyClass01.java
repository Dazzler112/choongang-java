package ch06.lecture.p05this;

public class MyClass01 {
	
	//instance field
	String name;
	
	//instance method
	void printName() {
		//this : 참조 변수를 대체하는 키워드
		System.out.println(this.name);//여기서 this는 인스턴스 필드에 있는 String name;
		System.out.println(this.now());
	}
	String now() {
		return "세시 십분";
	}
}
