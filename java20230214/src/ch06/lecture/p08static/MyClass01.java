package ch06.lecture.p08static;

public class MyClass01 {
	//필드
	
	//인스턴스 필드
		String name;
	//정적(Static)필드
		static String company;	
	//인스턴스 필드 초기화
	MyClass01(){
		name = "son";
		
	}
	//static field에서도 초기화 할수 있지만 더 다양한 코드 넣고 싶다거나 할때 아래처럼
	//static initialization block : 스태틱 필드 초기화(주로)
	//정적 초기화 블록 
	static {
	//명령문들
	company = "samsung";
	}
}
