package ch04.lecture.p03while;

public class C03Dowhile {
	public static void main(String[] args) {
		//do while
		//코드블럭 실행 후 조건 확인
		//조건이 true이면 코드 블럭 실행
		//반복
		
		boolean con = true;
		System.out.println("이전 명령문...");
		do { //false여도 1번은 실행하고 다음으로 넘어감
			System.out.println("명령문 반복1");
			System.out.println("명령문 반복2");
		}while(con);
		
		System.out.println("다음 명령문...");
	}
}
