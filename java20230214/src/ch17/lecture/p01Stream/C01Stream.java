package ch17.lecture.p01Stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		//여러 원소(element)의
		//순차적 처리 기능(메소드)를 제공하는 class또는 interface
		
		//스트림 만들기
		Stream<Integer> stream1 = Stream.of(5,1,3,9,10,0);
		
		//이제 순차적 처리 기능 만들면 됨..
		
		//스트림 메소드(연산)
		//	1.최종연산(terminal operation)
		//	리턴타입 : Stream아님 (스트림 아닌 다른값을 리턴해야한다..)
		//	최종 연산 시 중간연산도 같이 실행됨
		
		//개수세기(count)
		stream1.count();
		stream1.findFirst();  //최종연산 후 재사용 불가
		
		//	2.중간연산 (Intermediate operation)
		//리턴타입 : Stream(또다른 스트림을 리턴해야한다..)
	}
}
