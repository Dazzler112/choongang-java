package ch03.lecture.p03comparison;

public class C01Comparison {

	public static void main(String[] args) {
		//비교연산자
		//==, !=, <, <= , >, >=
		
		//연산결과는 boolean타입
		
		//자바에선 ===, !== 은없음
		int x = 3;
		int y = 5;
		
		boolean r1 = x== y;//false
		boolean r2 = x != y; //true
		
		boolean r3 = x < y;//true
		boolean r4 = x <= y; //true
		
		boolean r5 = x > y; //false
		boolean r6 = x >= y;//false
		
		
		//자바에선 ===, !== 가 없는 이유
		//같은 타입끼리 비교해야함
		int a = 30;
		String b ="50";
//		boolean c = a < b;//다른 타입 비교자체가 성립 안됨
		
		//정수 와 실수끼리는 가능함
		//하지만 타입을 맞춘 후 비교하기를 권장
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; //true
		System.out.println(r9);
		
	}
}
