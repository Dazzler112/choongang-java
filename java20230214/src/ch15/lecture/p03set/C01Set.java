package ch15.lecture.p03set;

import java.util.*;

public class C01Set {//별일 없으면 set에선 Hashset을 사용 해라
	public static void main(String[] args) {
		//set : 순서 없음, 중복 안됨
		Set<Integer> set = new HashSet<>();
		
		//add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90);  //안들어감
		
		//size 크기
		int size = set.size();//5개 있으니까 5개 아닌가?
		System.out.println(size); //응 중복 허용 불가여서 마지막껀 안들어갔어
		System.out.println(set);
		
		//remove
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set);
		
		//전체탐색
		System.out.println("향상된 for문%%%%%%%%%%%");
		for(Integer e : set) {
			System.out.println(e);
		}
		//고전적 for 사용 불가 why? index 가 없기에..
		
		//iterator
		System.out.println();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("forEach***************************");
		set.forEach(e -> System.out.println(e));
		
		System.out.println("forEach^^^^^^^^^^^^^^^^^^^^");
		set.forEach(System.out::println);
	}
}
