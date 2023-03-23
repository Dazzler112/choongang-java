package ch15.lecture.p08unmodifiable;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A","B","c");
		//immutableList1.add("D"); (x) 불변이여서 추가 불가
		
		//get은 가능함
		System.out.println();
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A","B","C");
		//imutableSet1.remove("A"); (x) 불변이여서 삭제 불가
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1,"A",
				2, "B",
				3, "C");
		//imutableMap1.put(4,"D"); (x)
		//불변이여서 추가 불가
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list  = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		//수정 가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("D");
		System.out.println(list2);
		
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		//수정 가능한 Set 만들기
		Set<String> set2 = new HashSet<>(immutableSet2);  //()부분에  copyof 인스턴스 만든 변수명 붙이면 됨
		set2.add("E");
		System.out.println(set2);
		
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		//수정 가능한 Map 만들기
		Map<Integer,String> map2 = new HashMap<>(immutableMap2);
		map2.put(4, "D");
		System.out.println(map2);
		
		//배열로 부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 =Arrays.asList(arr);//변경은 가능 하지만 사이즈 변경이 안됨
		
	}
}
