package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		//코드 작성
		int temp = x;
		x = y;//  5
		y = temp;// y= x; 5 가 나오기때문에 변수 하나를 더 설정 하자
		         //그리고 그 변수명을 y에 다시 할당 하자
		System.out.println(x); //5
		System.out.println(y); //3
	}
}
