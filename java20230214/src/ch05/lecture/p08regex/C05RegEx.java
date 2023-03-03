package ch05.lecture.p08regex;

public class C05RegEx {
	public static void main(String[] args) {
		//character class
		
		//알파벳 소문자인가 표현하고 싶다..
		System.out.println("a".matches("[abcdefgfijklmnopqrstuvwxyz]"));
		System.out.println("b".matches("[abcdefgfijklmnopqrstuvwxyz]"));
		System.out.println("x".matches("[abcdefgfijklmnopqrstuvwxyz]"));
		System.out.println("z".matches("[abcdefgfijklmnopqrstuvwxyz]"));
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("b".matches("[a-z]"));
		System.out.println("x".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
	}
}
