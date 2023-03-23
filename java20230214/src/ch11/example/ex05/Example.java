package ch11.example.ex05;

public class Example {
	public static void main(String[] args) {
		
	}
	public static void m1() {
		
	}
	public static void method2() throws Exception{//보기2번
		method1();
	}
	
	public static void m3() { //보기 3번 이게 예제가 틀렸다
		try {
			method1();
		}catch (Exception e) {//상위클래스
			// TODO: handle exception
		}catch (ClassNotFoundException e) { //도달 불가
			// TODO: handle exception
		}
	}
	
	public static void m4() { //보기 4번
		try {
			method1();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1() throws NumberFormatException,ClassNotFoundException {
		//문제
	}
}
