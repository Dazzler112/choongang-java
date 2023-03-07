package ch07.Example.ex06;

public class Parent {
	public String name;
	public Parent(String name) {
		this.name = name;
	}
}

public class Child extends Parent{
	public int studentNo;
	
	//해결법
	//1.부모 클래스에 파라미터 없는 생성자 만들기
	//2.자식 클래스 생성자 에서 부모클래스에 존재하는 생성자 호출코드 작성
	public Child(String name, int studentNo) {
		super(name);//상위코드의 생성자 파라미터 써줘야함 기본이 아니기때문에
		this.name = name;
		this.studentNo = studentNo;
	}
}
