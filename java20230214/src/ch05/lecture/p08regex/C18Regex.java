package ch05.lecture.p08regex;

public class C18Regex {
	public static void main(String[] args) {
		//특수기호
		//Predefined character classes
		//숫자 표현
		String pattern = "[0-9]";
		String pattern2 = "\\d"; //\d 역슬래쉬 표시하려면 \\2번 써야하니까
		
		System.out.println("0".matches(pattern));
		System.out.println("0".matches(pattern2));
		System.out.println("5".matches(pattern2));
		System.out.println("9".matches(pattern2));
		
		//ex)주민등록번호 매치
		System.out.println("19920112".matches("[0-9]{8}"));
		System.out.println("19920112".matches("\\d{8}"));
		
		//전화번호
		//010으로 시작, -하나 있거나 없거나, 숫자4개,-하나 있거나 없거나 ,숫자4개
		String number1 = "01099999999";
		String number2 = "010-88888888";
		String number3 = "010-7777-7777";
		
		String patter3 = "010-?\\d{4}-?\\d{4}";
		System.out.println(number1.matches(patter3));
		System.out.println(number2.matches(patter3));
		System.out.println(number3.matches(patter3));
	}
}
