package ch06.lecture.p04static;

public class MyClass02 {
	//static field(variable) (class field(variable))
	static String name; //인스턴스 와 차이는 무엇이냐?
	static int age; 	//인스턴스는 각각이 가지고 있고 이건 클래스가 가지고있는거다
	//인스턴스 없이 클래스를 통해서 사용할 수있다
	//static method (class method)
	static void greeting() {
		System.out.println(age + "세" + name + "입니다.");
	}
}
