package ch12.lecture.p01object;

public class C11Enum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		System.out.println(s1.ordinal()); //순서 알고싶을때 ordinal이라는걸 쓴다
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
		
		Season s5 = Season.valueOf("SPRING");
		Season s6 = Season.valueOf("SUMMER");
		Season s7 = Season.valueOf("FALL");
		Season s8 = Season.valueOf("WINTER");
		
		System.out.println(System.identityHashCode(s1));//1이나 5나 같은 값이다
		System.out.println(System.identityHashCode(s5));
	}
}
//아까 전파일의 값만 얻고싶은대 코드가 너무 길다 
enum Season{//나열만 하면 아까와 유사하게 고정된 값만 얻는다
	SPRING, SUMMER , FALL , WINTER
}