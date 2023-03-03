package ch05.lecture.p08regex;

public class C23Regex {
	public static void main(String[] args) {
		// . 
		// \. : .이란 문자를 표현
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));//모든 문자니 일치
		System.out.println("a".matches(pattern2));//.이니까 일치X
		
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		//영문대소문자 여러개 .com으로 끝나는지?
		
		String pattern3 = "[a-zA-z]+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));
		System.out.println("daumcom".matches(pattern3));
	}
}
