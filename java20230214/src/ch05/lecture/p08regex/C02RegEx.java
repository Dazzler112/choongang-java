package ch05.lecture.p08regex;
//기본
public class C02RegEx {
	public static void main(String[] args) {
		//matches
		//패턴에 맞으면 true, 그렇지 않으면 fasle
		
		//문자 하나 패턴
		System.out.println("a".matches("a"));//문자열이 이패턴가 일치 하는가?
		System.out.println("b".matches("b"));//true
		System.out.println("c".matches("c"));//true
	}
}
