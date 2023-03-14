package ch12.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14F;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		//여기까지 auto Boxing
		
		
		//이제부터 자동형변환 초기에는 안됐던 내용이다
		Object o1 = b;
		Object o2 = bool;
		
		Object o3 = true;
	}
}
