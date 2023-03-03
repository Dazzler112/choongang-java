package ch06.lecture.p07constructor;

public class C06Constructor {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06("son", 77);
		
//		MyClass06 o2 = new MyClass06();//X 
		//안됨 왜? 생성자를 생성했기 때문에 기본생성자 생성 불가
	//근대 기본생성자도 쓰고싶으면 어떻게함? 07번으로
	}
}
