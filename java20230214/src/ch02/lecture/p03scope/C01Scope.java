package ch02.lecture.p03scope;

public class C01Scope {
	public static void main(String[] args) {
		//변수의 사용범위 (scope)
		//선언된 블럭 안에서만 사용 가능
		
		int v1 = 3;
		
		if(true) {
			System.out.println(v1);//위의 v1 사용 가능
			
			int v2 = 5;
			
			System.out.println(v2);
		}
//		System.out.println(v2);//블락 밖에서 선언 불가 
		//자바스크립트 code block 생각하면 됨
	}
}
