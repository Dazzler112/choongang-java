package ch08.example.ex08;

public class Example8 {

	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	} 
}
