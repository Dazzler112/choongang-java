package ch17.lecture.p02terminaloperation;

import java.util.*;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list =  List.of(1,2,3,9,8,7);
		
	List<Integer> r1	= list.stream()
					//arraylist에서 생성된 객체가 a에 들어가고 list에있는 1이 들어가서 1번 반복..
			.collect(ArrayList::new, List::add ,List::addAll);
		
		System.out.println(r1);
	}
}
