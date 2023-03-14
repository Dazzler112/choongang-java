package ch15.lecture.p01list;

import java.util.*;

//전체 탐색
public class C02List {
	public static void main(String[] args) {
		//List 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");
		
		//for 고전적 방법
		System.out.println("for##############");
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//향상된for
		System.out.println("향상된 for###########");
		for(String e : list) {
			System.out.println(e);
		}
		
		//Iterator 탐색하기 위해 만들어진 놈 while과 궁함 잘맞음
		System.out.println("Iterator###############");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//forEach 메소드
		System.out.println("forEach 메소드 $$$$$$$$$$$$$$$$$");
		list.forEach(e -> System.out.println(e));
		
		//forEach메소드
		System.out.println("forEach 메소드 *****************");
		list.forEach(System.out::println);
	}
}
