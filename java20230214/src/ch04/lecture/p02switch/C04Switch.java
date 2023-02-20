package ch04.lecture.p02switch;

public class C04Switch {
	public static void main(String[] args) {
		//break 없이 코드블럭 작성 가능한 명령문 이 있다
		
		int val = 1;
		
		switch (val) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		case 3:
		case 4:
			System.out.println("code 3,4");
			break;
		default:
			System.out.println("default code");
			break;
		}
		
		//다른방식
		//switch labeled statement (break없이 사용가능)
		switch (val) {
		case 1 ->//명령문 하나일 때 중괄호 생략 가능
				// 꼭 써라는말 안함 왜냐? 읽기 쉬워서
		System.out.println("code 1");
		
		case 2 ->{
		System.out.println("code 2");
		}
		case 3,4->{
			System.out.println("code 3,4");
		}
		default ->{
		System.out.println("default code");
		}
		}
	}
}
