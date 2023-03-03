package ch06.lecture.p10access;

public class MyClass05 {
	
	private static MyClass05 ins;
	//1 접근 못하게 제한
	private MyClass05 () {
		
	}
	
	//2 내부에서 접근 가능하도록 설정
	public static MyClass05 getInstance() {
		if (ins == null) {
			ins = new MyClass05();
		}
		return ins;
	}
}
