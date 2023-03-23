package ch17.lecture.p02terminaloperation;

import java.util.*;
import java.util.stream.*;

public class C02Count {
	public static void main(String[] args) {
		//count
		IntStream stream1 = IntStream.range(0, 100);
		
		long count1 = stream1.count();
		System.out.println(count1);
		
		List<String> list =  List.of("java","spring","css");
		Stream<String> stream2 = list.stream();
		long count2 = stream2.count();
		
		System.out.println(count2);
		
		long count3 = list.stream().count();//보통은 이런식으로 붙여서 씀
		System.out.println(count3);
		
		//method chaining
		long count4 = list.stream() //이런식을 method chaining 이라고 한다
				.map(s->s.startsWith("c"))
				.count();
		
		System.out.println(count4);
	}
}
