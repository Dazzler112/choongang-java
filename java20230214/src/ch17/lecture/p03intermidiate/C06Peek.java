package ch17.lecture.p03intermidiate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {
		(new Random()).ints(5)
			.peek(System.out::println) //여기서 한번 걸러지고
			//peek의 활용성은? 중간에 잘 연산되고 있는지 확인하려고
			//Bug 잡는 용도로 주로 사용 
			//이런게 있다 넘어가자
			.forEach(System.out::println);//하지만 여기서 한번에 연산된거임
	}
}
