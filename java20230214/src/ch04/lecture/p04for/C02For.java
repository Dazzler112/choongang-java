package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		int i = 0;
		while (i < 3) {
			System.out.println("while loop");
			i++;
		}
		
		for(int j = 0; j <  3; j++) {
			System.out.println("for loop");
		}
		System.out.println(i);
//		System.out.println(j); for문 코드블락내에 있지 않아 출력 되지 않음
		//방법은? for문위에 int j =0; 선언 하면 사용 할 수 있다
	}
}
