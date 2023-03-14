package ch15.example.ch05_ex07;

import java.util.*;

public class Example0507 {
	public static void main(String[] args) {
		//int[] array = {1, 5, 3, 8, 2};
		
		//of : 수정 불가능한 리스트를 리턴 
		List<Integer> list = List.of(1,5,3,8,2); //어레이열에 있는것을 이렇게도 인스턴스화 가능
		
		//위의 리스트에서 최대값 구하는 코드 작성
		int max = Integer.MIN_VALUE;
		for(Integer e : list) {
			max = Math.max(max, e);
		}
		System.out.println(max);
	}
}
