package ch17.lecture.p03intermidiate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(0);
		
		Stream<Integer> stream1 = list.stream();
		
		Stream<Integer> stream2 = stream1.distinct();
		
		//최종연산 실행시 중간연산이 한번에 실행됨
		list.add(2);//이런식으로 작성하지 말아라 중간연산 보여주려고 예시 보여준것(해석하기 어려워짐)
		long count1 = stream2.count();
		System.out.println(count1);
	}
}
