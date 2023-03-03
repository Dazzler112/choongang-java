package ch05.lecture.p08regex;
//학습
public class C03RegEx {
	public static void main(String[] args) {
	//Character class(문자 분류)
	
	System.out.println("a".matches("[abc]"));//분류된 문자중 하나인가?
	System.out.println("b".matches("[abc]"));//true
	System.out.println("c".matches("[abc]"));//true//이문자대로 분류된 패턴인가?
	System.out.println("d".matches("[abc]"));//false 문류들에 포함 안돼있음
	
	}
}