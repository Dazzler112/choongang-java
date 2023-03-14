package ch13.lecture.p01generic;

public class C09Inherit {
	public static void main(String[] args) {
		
	}
}

class Super09<T>{}
//부모가 타입 파라미터 있으면 자식도 <> 써줘야함
class Sub09<T> extends Super09<T>{
	
}

class Super10<T,U>{}
class Subl10<T,U> extends Super10<T,U>{}

class Super11<T>{}
class Sub11 extends Super11<String>{//구체적인 타입파라미터를 제시하면
	//자에선 <>t사용 안해도 됨
	
}

class Super12<T,U>{}
class Sub12<T> extends Super12<T,String>{
	//하나 구체적으로 제시하면 하나 빼도됨
}

class Super13<T>{}
class Sub13<T,U> extends Super13<T>{
	//아들쪽에 필요하면 U추가해도 됨
}

class Super14<T extends Number> {}
class Sub14<T extends Integer> extends Super14<T>{
	//아들쪽 하위타입으로상속은 가능 상위타입 불가
	//부의 상속이 number인대 상위인 object로 할순 없음
}