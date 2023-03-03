package ch02.lecture.p01variable;

public class VariableInitializationExample {
public static void main(String[] args) {
	//변수 value 선언
	int value;
	value = 5; //값을 할당하지 않아서 오류가 생김 할당해주면 문제 해결
	
	//연산 결과를 변수 result의 초기값으로 대입
	int result = value + 10;

	//변수 result 값을 읽고 콘솔에 출력
	System.out.println(result);
}
}
