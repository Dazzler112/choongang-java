package ch04.lecture.p02switch;

public class C06Switch {
	public static void main(String[] args) {
		//switch case(:) statement
		//switch labeled(->) statement
		
		//switch case(:) expression
		//switch labeled(->)expression
		int val = 1;
		String res = switch (val) {
		case 1:{
			yield "값1";
		}
		case 2:{
			yield "값2";
		}
		default:{
			yield "기본 값";
			//default 에도 yield 필수임
		}
		};//expression(식이라는 뜻(1+2같은거)) 방식
	
		switch (val) {
		case 1 -> "값"; //화살표는 스테이트먼트 값 1개면 중괄호 + yield 생략 가능
		
		case 2 -> "값2";
		
		case 3->{
			String r = "값" + val;
			yield r;
		}
		default -> {
			yield "기본 값;
		}
		};
	}
}
