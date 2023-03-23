package ch17.lecture.p02terminaloperation;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list =  List.of(9,1,2,3,5);
		
		Integer sum = list.stream()
				.reduce((a,b) -> a+b) //list 의 처음 2개(9,1)값 들어가서 0에 들어가고 그 결과가 다시 a에 들어가고  세번째가 (a(처음+두째값),b)중 b에 들어간다 반복
				.get();
		
		System.out.println(sum);
		
		//리듀스로 최대값 구하기 
		Integer max = list.stream()
				.reduce(Math::max)
				.get();
		System.out.println(max);
		
		//최소값 구하기
		Integer min = list.stream()
				.reduce(Math::min)
				.get();
		System.out.println(min);
	}
}
