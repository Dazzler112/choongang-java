package ch17.lecture.p02terminaloperation;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,4,1,2,10,20);
		
//		Integer max =  list.stream()
//			.max((x,y) -> x-y)
//			.get();
		
		Integer max =  list.stream()
				.max(Integer::compare) //(x,y) -> Integer.compare(x,y) 를 람다식으로 줄인거
				.get();
		System.out.println(max);
		
		Integer min = list.stream()
				.min(Integer::compareTo) //(x,y) -> xcompareTo(y) 를 람다식으로 줄인거
				.get();
		
		System.out.println(min);
	}
}
