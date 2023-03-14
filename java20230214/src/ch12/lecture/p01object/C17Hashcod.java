package ch12.lecture.p01object;

public class C17Hashcod {
	public static void main(String[] args) {
		Object o1 = new String("java");//o3는 재정의 됐다
		Object o2 = new String("spring");
		Object o3 = new String("java");//문자열이 같으면 같은 값을 가진다
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		//다음 해쉬코드의 짝 이퀄즈를 배워보자
	}
}
