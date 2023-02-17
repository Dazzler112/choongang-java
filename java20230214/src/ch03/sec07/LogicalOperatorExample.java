package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if((65<=charCode)&&(charCode<=90)) {
			System.out.println("대문자이군요");
		}
		if (('A'<=charCode)&&(charCode <='Z')) { //괜히 유니코드 표 찾아가면서 하지말고
			System.out.println("대문자이군요"); //이거처럼 해라
		}
		if((97 <= charCode)&&(charCode <=122)) {
			System.out.println("소문자이군요.");//false여서 실행하지 않음
		}
		if(('a' <= charCode)&&(charCode <='z')) { //이것도 그냥 이렇게 써라 유니코드 찾아가면서 하지말고
			System.out.println("소문자이군요.");
		}
		if((48<=charCode)&&(charCode<=57)) { //
			System.out.println("0~9 숫자이군요");
		}
		if(('0'<=charCode)&&(charCode<='9')) {	//이것도 일일이 유니코드 찾지말고 이렇게 써라 좀!
			System.out.println("0~9 숫자이군요");
		}
		
		//--------------------------------------------
		
		int value = 6;
		//int value = 7;
		if((value%2 == 0)|(value%3 == 0)) {
			System.out.println("2또는 3의 배수이군요.");
		}
		
		boolean result = (value%2 == 0)||(value%3 == 0);
		if(!result) {
			System.out.println("2또는 3의 배수가 아니군요.");
		}
	}
}
