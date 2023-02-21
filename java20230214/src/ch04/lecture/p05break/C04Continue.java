package ch04.lecture.p05break;

public class C04Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 500; i++) {
			System.out.println("실행코드1");
			
			if(true) {//false면 실행코드 1, 2 500번 반복
			continue;
			}
			System.out.println("실행코드2");
		}
	}
}
