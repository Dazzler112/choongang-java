package ch17.example.ex06;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권",40),
				new Member("감자바",26));
		//전통 방법
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i < list.size();i++) {
			cnt = i;
			for(int j = 0; j < list.get(i).getAge();j++) {
				sum += j; 	
			}
		}
		System.out.println(sum/cnt);
		
		double avg = list.stream()
				.mapToInt(s -> s.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " +avg);
		
	}
}	
