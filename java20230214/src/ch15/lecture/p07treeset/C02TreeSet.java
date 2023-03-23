package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();//어디 기준으로 큰거 작은거 
		set.addAll(Set.of(3, 1, 20, 3000,15,7,9,2500 , 100));
		
		System.out.println(set); //이것도 정렬이 잘 되있다(작->큰순)
		
		//first
		System.out.println(set.first()); 
		//last
		System.out.println(set.last());
		
		//어떤 엘레먼트 기준으로 작은값을 알고싶다
		//lower
		System.out.println(set.lower(50));
		
		//어떤 기준으로 얘보다 큰값
		System.out.println(set.higher(50));
		
		//floor //이건 해당값 포함 해서 아래값이면 50도 포함
		System.out.println("floor");
		System.out.println(set.floor(50));
		System.out.println(set.floor(20));
		
		//Ceilling //포함해서 같거나 큰거
		System.out.println(set.ceiling(50));
		System.out.println(set.ceiling(100));
		
		//거꾸로 정렬된 NevigatableSet 리턴  //역순
		NavigableSet<Integer> decendingSet =  set.descendingSet();
		System.out.println(decendingSet);
	}
}	
