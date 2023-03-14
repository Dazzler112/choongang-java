package ch16.lecture.p03reference;

public class C06ConstructorReference {
	public static void main(String[] args) {
		//생성자 참조
		//Reference to a constructor
		MyInterface07 o1 = () -> {return new MyClass07();};//아래는 줄인것
		MyInterface07 o2 = () -> new MyClass07(); //아래는 더 줄인것
		MyInterface07 o3 = MyClass07::new; //생성자 참조
		
		MyInterface08 o4 = (a) -> new MyClass07(a);//파라미터 1개 받는거 아래가 줄인것
		MyInterface08 o5 = MyClass07::new; 
		//(파라미터와 생성자가 같다면 순서도 같다면 똑같이 가능)
	}
}

interface MyInterface08 {
	MyClass07 action(int a);
}

interface MyInterface07{
	MyClass07 action();
}

class MyClass07{
	MyClass07 (){
		//파라미터 없는 생성자
	}
	MyClass07(int a){
		//파라미터값1개있는 생성자
	}
}
