package ch05.lecture.p08regex;

public class C11Regex {
	public static void main(String[] args) {
		//010으로 시작하고 , -기호 , 숫자4개 , -기호,숫자4개 패턴인가?
		String patterString = "010-[0-9]{4}-[0-9]{4}";
		System.out.println("010-9999-7777".matches(patterString));//
		System.out.println("010-9876-7654".matches(patterString));
		System.out.println("01098767654".matches(patterString));
		System.out.println("010-9876-765".matches(patterString));
	}
}
