package ch17.lecture.p01Stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		//IntStream
		IntStream stream1 =  IntStream.range(0, 10);//0~9 range는 끝에 값이 포함 안됨
		System.out.println(stream1.count());
		
		IntStream stream2 =  IntStream.rangeClosed(0, 10);//시작 끝값 둘다 저장
		System.out.println(stream2.count());
		//메소드들 외우진말고 경험해보라고 알려주는거다
	}
}
