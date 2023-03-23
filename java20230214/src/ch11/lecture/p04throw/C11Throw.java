package ch11.lecture.p04throw;

public class C11Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("");//이렇게 오류 발생하면 던지가나 잡거나 선택할수 있겠구나? 배운거임
	}
}
