package ch17.lecture.p02terminaloperation;

import java.util.*;

public class C11Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,4,5,1);
		
		Integer r1 = list.stream()
				.reduce(0,Integer::sum);//초기값이 있는경우 0,list의 3 그다음 합계, 그다음4가 들어감 ...계속들어감
				
				System.out.println(r1);
				
				Integer r2 = list.stream()
						.reduce(1, (a,b)->a*b);
				System.out.println(r2);
	}
}
