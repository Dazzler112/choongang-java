package ch17.lecture.p03intermidiate;

import java.util.*;

public class C09Map {
	public static void main(String[] args) {
		List<String> list = List.of("java","html","css");
		
		list.stream()
		.map(s-> "hello" + s)
		.forEach(System.out::println);
		
		//파라미터값과 리턴타입이 달라도된다 다음파일에 보여줌!
	}
}
