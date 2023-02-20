package ch04.lecture.p01if;

public class C01If {

	public static void main(String[] args) {
		//if : 조건문(분기문)
		
		System.out.println("이전 실행문");
		if(true) {
			System.out.println("실행문1");
		}//true면 무조건 이전>실1>실2 실행됨
		System.out.println("실행문2");
	//false 일경우 이전>실행2만 실행됨
	
	//if의 코드블럭의 명력문이 하나면 {}생략 가능
	
	if(true) //중괄호 생략 가능한대 하지말아라! 코드 읽기가 힘듦
		System.out.println("실행문3");
		System.out.println("실행문4");
		
	}
}
