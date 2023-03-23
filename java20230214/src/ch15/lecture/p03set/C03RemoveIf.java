package ch15.lecture.p03set;

import java.util.*;
//특정 지우기 removeIf
public class C03RemoveIf {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		set.removeIf(e->(e.length() % 2) ==0);//for문 iterator 안쓰고 사용 가능하다!
		System.out.println(set);
	}
}
