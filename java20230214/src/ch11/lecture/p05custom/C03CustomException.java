package ch11.lecture.p05custom;

public class C03CustomException {
	public static void main(String[] args) {
		MyException1 e = new MyException1();
		MyException1 e1 = new MyException1("some message");//안되는 이유는 생성자가 String 받는 파라미터가 아니여서 그럼 해당을 받는 생성자로 만들어라
		System.out.println(e.getMessage());//null
		System.out.println(e1.getMessage());
	
	}
}
	class MyException1 extends Exception {
		public MyException1() {
			
		}
		public MyException1(String message) {
			super(message);
		}
	}

