package ch03.lecture.p01arithmetic;

public class C08Sign {
	public static void main(String[] args) {
		//부호 연산자
		// + , -
		
		int a = 3;
		int b = +5;
		
		int c = 7;
		int d = -9;
		
		int e = +b;
		int f = -d; // -  - 만나서 +로 바뀜
		System.out.println(f);
		
//		String g = "33";
//		int h = +g; 문법 자체가 틀림 성립 안됨 
	}
}
