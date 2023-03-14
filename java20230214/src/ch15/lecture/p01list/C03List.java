package ch15.lecture.p01list;

import java.util.*;

public class C03List {
	public static void main(String[] args) {
		//List의 List
		
		//하나 타입일때
		List<String> list1 = new ArrayList<>();
		
		//list 의 list
		List<List<String>> list2 = new ArrayList<>();
		var list3 = new ArrayList<List<String>>();//타입 유추 가능하니 이것도 가능
		
		list2.add(new ArrayList<>());
		list2.add(new ArrayList<>());
		
		System.out.println(list2.get(0).size());
		System.out.println(list2.get(1).size());
		
		list2.get(0).add("java");
		list2.get(1).add("spring");
		
		list2.get(1).add("css");
		list2.get(1).add("html");
		list2.get(1).add("js");
		//전체탐색 C02에 배웠던거 쓰면되지만 하나씩 알려준다
		//for
		System.out.println("for##############");
		for(int i = 0; i < list2.size();i++) {
			for(int j = 0; j < list2.get(i).size();j++) {
				System.out.println(list2.get(i).get(j));
			}
		}
		
		// 향상된 for
				System.out.println("향상된 for $$$$$$$$$$$$$");
				for (List<String> list : list2) {
					for (String item : list) {
						System.out.println(item);
					}
				}
		
		//iterater 생략
		
		//forEach
		System.out.println("forEach %%%%%%%%%%%%%%%");
		list2.forEach(list -> list.forEach(e->System.out.println(e)));
		//또는 람다 줄여서
		//forEach
		System.out.println("forEach %%%%%%%%%%%%%%%");
		list2.forEach(list -> list.forEach(System.out::println));
	}
}
