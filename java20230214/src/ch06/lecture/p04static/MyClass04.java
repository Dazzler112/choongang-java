package ch06.lecture.p04static;

public class MyClass04 {
	//static member끼리 접근 가능
	static String name;
	
	static void hello() {
		System.out.println(name + " 님 안녕하세요.");
		System.out.println("오늘은 " +now() + "입니다.");
	}
	//static 멤버끼리도 서로 접근 가능하다
	static String now() {
		return "2023-02-28";
	}
}
