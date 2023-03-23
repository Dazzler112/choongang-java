package ch15.lecture.p05queue;

import java.util.*;

public class C01Queue {
	public static void main(String[] args) {
		//Queue의 영혼의 동반자 LinkedList
		Queue<String> queue = new LinkedList<>();
		
		//주요 메소드
		//offer  : 새 아이템 삽입
		queue.offer("kang");
		//poll : 기존 아이템 삭제(꺼네기) //선입 선출이여서 먼저 들어온놈 먼저 나간다
		String s1 = queue.poll();
		
		System.out.println(queue.size());
		System.out.println(s1);
		
		System.out.println();
		queue.offer("chae");
		queue.offer("song");
		queue.offer("jeong");
		queue.offer("seo");
		System.out.println(queue.size());
		
		
		System.out.println(queue.poll());  //chae가 먼저 들어왔으니 나가고
		System.out.println(queue.size());	//size가 3개가 됨
		
		//전체탐색
		while(queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}
}
