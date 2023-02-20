package ch04.lecture.p01if;

public class C04Random {
	public static void main(String[] args) {
		//Math.random()
		//0 <= Math < 1 의 double 값 리턴
		
		//ex)0 , 1 ,2 정수를 뽑고싶다
		int res1 = (int) (Math.random() * 3);
		System.out.println(res1);
		
		//ex) 1, 2, 3
		int res2 =((int) (Math.random() ) * 3) +1;
		System.out.println(res2);
		
		//ex) 주사위 (1,2,3,4,5,6)
		int res3 = ((int) (Math.random() * 6))+1;
		System.out.println(res3);
		
		//ex)로또 번호(1 ~ 45)
		int res4 = ((int) Math.random() * 45)+1;
		System.out.println(res4);
	}
}
