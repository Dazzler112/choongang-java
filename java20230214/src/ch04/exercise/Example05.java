package ch04.exercise;
//중첩for문을 이용 방정식 4x+5y = 60의 모든해를 구해서 (x,y)
//형태로 출력하는 코드를 작성해 보시오 단 x,y는 10이하 자연수
public class Example05 {
	public static void main(String[] args) {
		for(int x = 1; x <=10;  x++) {
			for(int y = 1; y<=10; y++) {
				int result = (4*x)+(5*y);
				if(result == 60) {
					System.out.printf("(%d,%d)%n", x,y);
				}
			}
		}
	}
}
