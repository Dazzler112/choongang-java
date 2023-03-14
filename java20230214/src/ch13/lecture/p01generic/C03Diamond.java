package ch13.lecture.p01generic;

public class C03Diamond {
	public static void main(String[] args) {
		MyClass03<String> o1 = new MyClass03<String>(); //선언 가능
		
		//인스턴스 만드는 타입의 아규먼트 생략 가능  //뒤의생성자쪽 <> 부분
		MyClass03<String> o2 = new MyClass03<>();
	}
}

class MyClass03<T> {
	public T item;
}