package ch15.example.ch05ex08remaster;

import java.util.*;

public class Ch05e08 {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));
		
		//문제6
		System.out.println(list.size()); //?
		System.out.println(list.get(2).size()); //?
		
		// 문제 8
		// 합, 평균 구하기
		int sum = 0;
		int cnt = 0;
		for(List<Integer> l : list) {
			for(Integer s : l) {
				sum +=s;
				cnt++;
			}
		}
		double avg = (double) sum / cnt;
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		
		/*int sum = list.size();   내가 푼거 평균을 못품
		int cnt = 0;
		for(int i = 0; i < list.size();i++) {
			for(int j = 0; j < list.get(i).size();j++) {
				sum += list.get(i).get(j);
			}
		}
		System.out.println(sum);*/
	}

}
