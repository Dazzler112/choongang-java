package ch02.lecture.p05print;

public class C03print {
	public static void main(String[] args) {
		//printf : 형식에 맞춰서 출력
		
		System.out.printf("어떤 형식");
		System.out.printf("또 다른 형식");
		
		//%n : 새로운 줄 
		System.out.printf("새로운 줄 포함%n새줄에 출력됨");
		// \n : 이것도 새로운 줄
		
		System.out.printf("역슬래쉬 사용 \n새 줄?");
		
		// %d : 10진법 정수 출력하기 위한 코드
		System.out.printf("10진법 정수 %d", 99);
		System.out.printf("%n또 다른 정수 %d", 300);
//		System.out.printf("%n또 다른 정수 %d","삼백"); //정수가 상태가 아님
//		System.out.printf("%n또 다른 정수 %d","3000");//정수가 아니다
//		System.out.printf("%n 정수 %d",3.14);//정수가 아니라 실수임
		
		//%f : 10진법 실수
		System.out.printf("%n10진법 실수 %f",3.14);
		System.out.printf("%n10진법 실수 %f",9.999);
//		System.out.printf("%n10진법 실수 %f",3);//정수는 출력이 안됨
//		System.out.printf("%n10진법 실수 %f","3.14");//실수가 아니라 char다
		
		//%s : 문자열
		System.out.printf("%n문자열 %s","hello");
		System.out.printf("%n문자열 %s","world");
		System.out.printf("%n문자열 %s", 3.14);//실수 출력ok
		System.out.printf("%n문자열 %s", 99);//정수도 ok
		
		System.out.printf("%n%s world","hi");//hi는 %s 위치에 위치하게됨
		System.out.printf("%n%d 숫자",999);//이것도 마찬가지로 999는 %d에 위치함
		System.out.printf("%n....%f.....",3.14);
	}
	
}
