package ch09.lecture.p02anonymous;

public class C05Anonymous {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		method1(o1);//여기까지 예전에 배운 내용들
		
		class SubClass05 extends MyClass05 {
			
		}
		MyClass05 o2 = new SubClass05();
		method1(o2);//된다
		
		MyClass05 o3 = new MyClass05() {
			
		};
		method1(o3); //이렇게 줄여서 한번엔넣으나
		
		method1(new MyClass05());//이렇게 줄이고 줄이고 줄인 코드나 같은코드다
	}
	public static void method1(MyClass05 param) {
		
	}
}

class MyClass05{
	
}