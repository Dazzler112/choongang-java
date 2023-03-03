package ch06.lecture.p03method;

public class MyClass09 {
	
	void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	void method1(int i) {
		System.out.println("파라미터 하나 받는 메소드");
	}
	void method1 (int i , int j) {
		System.out.println("파라미터 두개 받는 메소드");
	}
	
	void method2 (int[] args) {
		for(int arg : args) {
			System.out.println("받은 파라미터: " + arg);
		}
	}
	//위의 저것도 불편하다
	//가변길이 아규먼트 (varargs)(대충 다양한 아규먼트라는 뜻?)
	void method3 (int... args) {//...여러개 받는다는 뜻
		//varargs에서 계속-> args를 배열로 사용
		for(int arg : args) {
			System.out.println("가변길이 파라미터 : " +arg);
		}
	}
	//가변길이 매개변수는 파라미터 목록에서 가장 오른쪽에 작성해야함
	void method4 (String param, double d, int...values) {
		
	}
}
