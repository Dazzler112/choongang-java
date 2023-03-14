package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	//java.util.List
	//순서가 있는 콜렉션
	//각 아이템(element ,원소) 는 index로 접근 가능
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		//elements 추가
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		//element 얻기
		String e1 = list.get(0); //String에 담아서 쓰면 된다
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		//list 크기
		int size = list.size();
		
		//특정 index의 elemnet지우기
		//지은후 오른쪽의 값이 왼쪽에 채워짐
		list.remove(2); //이러면 2번인덱스 지워지고
		System.out.println("지은 후 크기는 : " + list.size());//3
		System.out.println("지은후 2번 index의 값: " + list.get(2)); //2번 인덱스가 지워진게 아니라 3번이 2번으로 가짐
																	//그럼 3번은 어떻게됨? 3번은 없음
		//특정  index의값 바꾸기
		list.set(2, "react");
		}
}
