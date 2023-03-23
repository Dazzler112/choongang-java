package ch15.lecture.p03set;

import java.util.*;

//엘레먼트 있는지 없는지 확인
public class C04Contains {
	public static void main(String[] args) {
		Set<String> set = Set.of("java","css","html","jsp"); //of 는 변경 불가능하다
		
		//contains : 해당 원소가 이미 있는지?
		System.out.println(set.contains("java"));
		System.out.println(set.contains("jsp"));
		System.out.println(set.contains("python"));
		System.out.println(set.contains(new String ("java")));//이경우도 true가 나오겠느냐?
		
		//다음파일 조금더 심화
	}
}
