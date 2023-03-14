package ch08.lecture.p04etc;

public interface MyInterface03 {
	//인터페이스에선 인스턴스 필드 생성 불가
	//static field
	public static final int i = 3; //생략하면 앞에 무조건 public임
	
	//public static final 생략
	int j = 5;
	String MY_HOME = "seoul";
}
