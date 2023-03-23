package ch17.lecture.p02terminaloperation;

import java.util.*;

//이번에는 String으로
public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java","css","html","jsp");//각 문자열의 길이값을 구해보자
		
		Integer sum= list.stream()
			.map(e -> e.length())//파라미터 받을것을 길이로 랩핑하는 메소드
			.reduce(Integer::sum)//.reduce((a,b) -> a+b)
			.get();
		
		System.out.println(sum);
	}
}
