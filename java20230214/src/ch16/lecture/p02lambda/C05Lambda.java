package ch16.lecture.p02lambda;
//return이 있는 타입
public class C05Lambda {
	MyInterface05 o1 = new MyClass05();
	int r1 = o1.method();
	//여기까지 일반적인 식
	
	//람다식
	MyInterface05 o2 = () -> {
		System.out.println("람다로 메소드 재정의");
		
		return 3; //<- 여기에 리턴이 있어야 겠다
	};
	int r2 = o2.method(); //어떤식에 담아서 쓰면 사용 된다
	
	MyInterface05 o3 = () -> {
		return 5;
	};
	int r3 = o3.method();
	
	MyInterface05 o4 = () -> 5; //어차피 return명령문 하나 밖에 없으니 return도 생략
	int r4 = o4.method();
}

class MyClass05 implements MyInterface05{ 
	@Override
	public int method() {
		System.out.println("명령문 작성..");
		return 0;
	}
}

interface MyInterface05{
	int method();
}