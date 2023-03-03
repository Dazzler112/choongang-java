package ch05.lecture.p08regex;
//학습정리
public class C04RegEx {
	public static void main(String[] args) {
		System.out.println("ab".matches("ab"));//일치
		System.out.println("bc".matches("bc"));//true
		
		System.out.println("ab".matches("[abc][abc]"));//ture
		System.out.println("aa".matches("[abc][abc]"));
		System.out.println("ac".matches("[abc][abc]"));
		System.out.println("bc".matches("[abc][abc]"));
		System.out.println("cc".matches("[abc][abc]"));//모두다 true
	}
}
