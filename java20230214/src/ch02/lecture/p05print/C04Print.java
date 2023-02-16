package ch02.lecture.p05print;

public class C04Print {
public static void main(String[] args) {
	//아규먼트는 순서대로 적용됨
	System.out.printf("%d,%d%n",3,4);//아규먼트 숫자만큼 넣어줘야함
						//%d가 2개니까 정수 2개넣어줘야함
	System.out.printf("%d,%f",3,3.14);//아규먼트 정수 실수니까 정수 실수 넣어줘야지 정수 정수,실수 정수 X 순서대로 넣어야한다
	
	System.out.printf("%f,%d,%s%n",3.14, 999,"hello");
}
}
