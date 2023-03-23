package ch15.sec03.exam03;

import java.util.*;

public class HashsSetExample {
	public static void main(String[] args) {
		//HashSet컬렉션 발생
		Set<String> set = new HashSet<String>();
		
		//객체 추가
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hashCode()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println( elemnet);
			if(element.equals("JSP")) {
				//가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
		} 
		System.out.println();
		
		//객체 제거
		set.remove("JDBC");
		
		//객체를 하나씩 가져와라
		for(String elemnet : set) {
			System.out.println(elemnet);
		}
	}
}
