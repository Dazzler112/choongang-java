package ch06.lecture.p05this;

public class MyClass02 {
	//this를 특별히 쓰는경우
	
	//instance field
	String name;
	//instance method
	void printName() {
		String name = "park";
		//이상황에 필드에 있는 name을 사용하고싶다 이때 this 사용
		System.out.println(name);//local variable 지역변수를 가리킴
		System.out.println(this.name); // instance field
	}
	
	void setName(String name) {//name 받는다는것을 코드에 나타내고 싶었다
		//파라미터 name을 필드 name에 할당
//		name = name; //하지만 name이 너무 많다 그럴때는 아래처럼
		this.name = name;
	}
}
