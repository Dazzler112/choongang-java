package ch05.lecture.p08regex;

public class C09Regex {
	public static void main(String[] args) {
		//character class
		//negation(not)
		
		//숫자 아니면 일치
		System.out.println("0".matches("[0-9]")); //false나오게 하고싶다..
		System.out.println("0".matches("[^0-9]"));//이런식으로
		System.out.println("a".matches("[^0-9]")); //^ not이라는 뜻
		System.out.println("z".matches("[^0-9]"));
		System.out.println(" ".matches("[^0-9]"));
		System.out.println("$".matches("[^0-9]"));
	}
}
