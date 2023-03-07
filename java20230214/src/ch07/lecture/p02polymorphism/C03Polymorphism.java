package ch07.lecture.p02polymorphism;

import java.util.*;
//object를 상속받은 것들(String Scanner 등등)
public class C03Polymorphism {
	public static void main(String[] args) {
		String s1 = "hello";
		Object o1 = s1;
		
		Object o2 = "java";
		
		char c1 = s1.charAt(0);
		char c2 = o1.charAt(0);//실행 불가 charAt은 object안에 없어서
		
		
		Scanner sc1 = new Scanner("");
		Object o3 = sc1;
		
		Object o4 = new Scanner("");
		
		sc1.nextLine();
//		o3.nextLine();//xx //nextLine은 object안에 없어서 문법 오류
	}
}
