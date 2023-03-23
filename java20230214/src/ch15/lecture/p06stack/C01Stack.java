package ch15.lecture.p06stack;

import java.util.*;

public class C01Stack {
	public static void main(String[] args) {
		//LIFO(Last in first out) , 후입선출,Stack
		//주요메소드
		//push : 새아이템 추가
		//pop : 아이템 꺼내기(삭제)
		Stack<String> stack = new Stack<>();
		
		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("daeman");
		stack.push("taewoong");
		
		System.out.println(stack.size());
		
		String s1 = stack.pop();//후입선출
		System.out.println(s1);
		
		//전체 탐색
		System.out.println("전체탐색#@&#$*@&$*");
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}
}
