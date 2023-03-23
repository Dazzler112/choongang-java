package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		//Map
		//(key,value)쌍 entry를 저장
		//key는 중복되지 않음
		Map<String, String> map = new HashMap<>();
		
		//entry추가  put메소드
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		//entry의 수
		int size = map.size();
		System.out.println(size); //3개넣었으니 3개
		
		map.put("kang", "baseball");//1-2대신 야가 들어간 대신에 slamdunk가 baseball로 바뀜
		
		System.out.println(map.size());//여전히 3개 키중복으로 인하여... 1-1
		
		//key로 value 얻기
		String v1 = map.get("serly");
		System.out.println(v1);
		System.out.println(map.get("kang"));//이렇게 키값을 넣어서 밸류값 확인 가능 진짜 baseball로 바뀌었다..
		
		//entry 지우기  >> 키값 를! 넣으면 됨
		map.remove("kang");
		
		//전체 탐색 (전체 탐색하기 위해 키가 필요함 그러기 위해 키를 꺼내는일으러먼저 해야겠지?)
		Set<String> keys = map.keySet();  
		for(String key : keys) {
			System.out.println(key +":" + map.get(key));
		}
		
		System.out.println("forEach 메소드$$$$$$$$$$$$$$$$$$$$");
		map.forEach((k,v) ->System.out.println(k + ":" +v));
		
		System.out.println("entrySet메소드 ^%$$%^%#$#$%@#@%");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String,String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
