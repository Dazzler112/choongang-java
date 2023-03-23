package ch17.lecture.p03intermidiate;

import java.util.*;
import java.util.stream.*;

public class C14FlatMap {
	public static void main(String[] args) {
		//flatMap:
		//원래 원소를 다른 원소 '들'로 매핑
		List<Integer> list = List.of(3,4,5);
		
		//map : 1 대 1
		long count1 = list.stream()
			.map(e -> e)
			.count();
		System.out.println(count1);//매핑하고 난 뒤에도 3개
		
		//flastMap : 1대 다(0~?)
		Long count2 = list.stream()
			.flatMap(e -> Stream.of(0,0))
			.count();
		System.out.println(count2);
	}
}
