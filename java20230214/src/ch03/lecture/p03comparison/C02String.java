package ch03.lecture.p03comparison;

public class C02String {
	public static void main(String[] args) {
		//문자열 같은 지 비교 ==사용하지 마시오!!
		//equals메소드 사용!!!
		//이유는 5장에서 나옴
		
		String str1 = "java";
		String str2 = "java";
		
		boolean r1 = str1 == str2;
		System.out.println(r1); //true
		
		String str3 = "ja";
		String str4 = "va";
		String str5 = str3+str4;
		
		System.out.println(str1);//"java"
		System.out.println(str5);//"java"
		
		boolean r2 = str1 == str5; //어쩔때 true 어쩔
		System.out.println(r2); //==쓰지 말아라
		
		//equals메소드 사용
		boolean r3 = str1.equals(str2); //자바스크립 관점으로 보면 객체에 파라미터 쓴것
		System.out.println(r3); //true
		
		boolean r4 = str1.equals(str5);//true
		System.out.println(r4);	//결론 ==쓰지말고 equals써라
		
		//다른 지 비교
		//!= 사용하지 말 것!
		//equals의 연산결과를 반전(!)
		boolean r5 = !str1.equals(str5);
		System.out.println(r5);// x.equals(X)에서 !x x앞에!붙이기!!!!
	}
}
