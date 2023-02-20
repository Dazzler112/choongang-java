package ch04.lecture.p01if;

public class C03ElseIf {
	public static void main(String[] args) {
		//else if 
		//위 if (else if)의 조건이 false이면 다른조건 확인
		
		System.out.println("code 1");
		if(false) {
			System.out.println("code 2");
		}else if(true) {//if가 false일때 실행
			System.out.println("code 3");
		}//else if도 false이면 넘어감 else if는 여러개일수 있다!
		//중괄호 생략 가능하지만 하지 말아라!!
		else if(true){
			System.out.println("code 4");
		}else {
			System.out.println("code 5");
		}//else같은경오는 위에가 다 false여야 실행됨
		System.out.println("실행 이어감.....");
	}
}
