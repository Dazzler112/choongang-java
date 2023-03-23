package ch17.lecture.p03intermidiate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		//map : 매핑(변환)
		List<Integer> list = List.of(2,1,0,3,9);
		
		System.out.println("0으로 매핑###");
		list.stream()
		.map(s -> 0)
		.forEach(System.out::println);
		
		System.out.println("2(짝수)로 매핑######");
		list.stream()
		.map(e -> e * 2) //Mapping 할께 integer면 integer만 매핑 되는가? 아니다!(파라미터값과 리턴타입이 달라도된다)
		.forEach(System.out::println);
	}
}
