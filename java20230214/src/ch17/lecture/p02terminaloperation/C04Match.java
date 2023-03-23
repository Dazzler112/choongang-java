package ch17.lecture.p02terminaloperation;

import java.util.*;

public class C04Match {
	public static void main(String[] args) {
		//Match
		//allMatch
		//anyMatch
		//noneMatch
		//리턴타임:boolean
		List<Integer> list = List.of(3,5,7,9,10);
		
		boolean r1 = list.stream().allMatch(e -> e>0);//양수인지 확인하고싶다
		System.out.println(r1);
		
		boolean r2 = list.stream().anyMatch(e -> e < 0);//하나라도 음수인게 있는가?
		System.out.println(r2);
		
		boolean r3 = list.stream().noneMatch(e -> e <0 );//모두 음수가 아닌가?
		System.out.println(r3);
	}
}
