package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	//지역변수 타입 추론
	//지역변수에만 일어남
	var c = 5; //이것처럼 안됨
	public static void main(String[] args) {
	//지역변수 타입 추론
	//var 사용
	//선언과 동시에 초기화 할 때만 사용 가능
	int a = 3;
	String b  = "java"; //넣어주는 값에 따라 타입 유추가 된다
	
	var c = 5;
	var d = "hello"; //var 이라는 키워드로 변수 생략 가능
	//하지만 지역변수에만 일어나는 일이다 필드에선 일어나지 않음
	
//	var e; //선언만은 안됨 초기화를 해야함
//	e =9;//선언만은 안됨 초기화를 해야함
	
	Box<String> box1 = new Box<String>();
	Box<String> box2 = new Box<>();
	var Box3 = new Box<String>();
	
	var list1 = new ArrayList<List<String>>();
	
	//재할당시 같은 타입만 가능
	var f = 10; //int로 추론
	f = 11;//ok
	
	f= 3.14 //x f 타입 처음들어갈때 int로 추론 됐기 때문에
			//다른타입 값 넣는거 안됨 자바스크립트엔 됐지?
			
	//var 사용시 읽기 쉬운 코드인가?? 고민하고 써야한다
	//ex)
	var list2 = new ArrayList<String>();
	//긴코드..
	for(String item : list2) { //이건 괜찮음 item이 string 타입이구나 알수 있으니
		
	}
	//하지만 너무 긴코드 로인해 아래같은경우는
	//권장하지 않음
	for(var item : list2) {
		//멀지 않은 경우는 변수 타입 읽는대 무리 없으면
		//이렇게 쓸수도 있겠지만 너무 멀리 떨어져 있으면 
		//권장X
	}
	
	//var은 키워드가 아님!!
	int var = 3;//사용 가능 하지만 변수 명으로 사용하지 말 것
	}
}
