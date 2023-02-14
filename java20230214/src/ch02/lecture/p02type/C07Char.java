package ch02.lecture.p02type;

public class C07Char {
public static void main(String[] args) {
	//char (문자)
	//하나의 문자값 저장
	//2bytes (16bits)
	//0 ~ 65535 (unicode)//수를 표현하려고 있는 코드가 아니기때문에 음수는 없음
	
	char c1 = 65261;
	
	System.out.println(c1);
	
	char c2 = 8594;
	
	System.out.println(c2);
	
	char c3 = '\u53f8';
	System.out.println(c3);
	
	char c4 = 'a';
	System.out.println(c4);
	
	char c5 = '가';
	System.out.println(c5);
	
//	char c6 = 'ab'; //XX 하나의 문자만 가능
	
//	char c7 = ''; //XX하나의 문자만! 빈문자도 불가
	
	char c8 = 'b';
	
	int d = c8 - c4; //연산도가능함
	System.out.println(d);
}
}
