package ch06.lecture.p05this;

public class C01This {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.name = "son"; //인스 턴스 접근 하려면 o1을 썼어야 했다
		o1.printName();
		
		String n = o1.now();
	}
}
