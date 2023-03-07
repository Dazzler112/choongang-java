package ch07.lecture.p02polymorphism;

import java.util.*;

public class C04Polymorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");
		
		method1(s1);//넣으면 되겠느냐? oo object 안에 있어서 된다
		method1(sc1);
	}
	
	public static void method1(Object o) {
//		o.charAt(0);//xx
//		o.nextLine();//xx
		
		String s = o.toString();
		System.out.println(s);
	}
}
