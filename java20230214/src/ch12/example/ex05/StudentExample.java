package ch12.example.ex05;

import java.util.*;

public class StudentExample {
	public static void main(String[] args) {
		//student를 저장하는 HashSet 생성
		HashSet hashSet = new HashSet();
		
		//student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));//같은 학번 이므로 중복 저장이 안됨
		hashSet.add(new Student("2"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}
}
