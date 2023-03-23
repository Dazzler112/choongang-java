package ch17.example.ex08;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		
		//collect
	Map<String, List<Member>> gruopingMap = list.stream().
			collect(Collectors.groupingBy(Member::getJob));
		
		//전통적 코드
		Map<String, List<Member>> map = new HashMap<>();
				/*작 성*/
		//collect
		
		//전통적
		for(Member member : list) {
			List<Member> val = map.get(member.getJob());
			if(val == null) {
			val = new ArrayList<>();
			map.put(member.getJob(), val);
			}
			val.add(member);
		}
		System.out.println("[개발자]");
		/*작성문*/
		//collect
		map.get("개발자").stream()
			.forEach(System.out::println);
		
		/*전통적*/
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("[디자이너]");
		/* 작성*/
		
	
		//collect
		map.get("디자이너").stream()
		.forEach(System.out::println);
		
		/*전통적*/
		List<Member> dev1 = map.get("디자이너");
		for(Member e : dev1) {
			System.out.println(e);
		}
		
	}
}
