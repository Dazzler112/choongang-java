package ch05.lecture.p08regex;
//pattern 1, 2 비교
public class C14Regex {
	public static void main(String[] args) {
		//{1,} 1개이상
		// + : 1개이상
		
		String pattern1 = "[a-z]{1,}";
		String pattern2 = "[a-z]+"; //1번 2번 서로 같은뜻
		System.out.println("abc".matches(pattern1));//true
		System.out.println("a".matches(pattern1)); //t
		System.out.println("A".matches(pattern1));//f
		
		System.out.println("abc".matches(pattern2));//true
		System.out.println("a".matches(pattern2)); //t
		System.out.println("A".matches(pattern2));//f
	}
}
