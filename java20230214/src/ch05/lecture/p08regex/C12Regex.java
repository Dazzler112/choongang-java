package ch05.lecture.p08regex;

public class C12Regex {
	public static void main(String[] args) {
		//수량 n개~n개 : {n ,n}
		String pattern = "a{1,3}";
		System.out.println("a".matches(pattern));//true
		System.out.println("aa".matches(pattern));//t
		System.out.println("".matches(pattern));//f
		System.out.println("aaaa".matches(pattern));//f
		System.out.println("abc".matches(pattern));//f
		
	}
}
