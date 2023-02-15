package ch02.lecture.p02type;

public class C12Casting {//강제형변환
	public static void main(String[] args) {
		//정수끼리 , 실수끼리
		//큰타입 -> 작은타입 으로 하려 할때 : 강제형변환(casting)
		int i1; //4bytes
		long l1; //8bytes
		
		l1 = 30;
//		i1 = l1;//오류가 발생!
		i1 = (int) l1; //정하고싶으면 앞에 (int)붙혀야함
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1);
		System.out.println(i1); // 데이터 소실 21억까진가가 저장데이터인대 넘어서

		short s1; 
		byte b1;
		
		s1 = 20000;
		b1 = (byte) s1;
		System.out.println(s1);
		System.out.println(b1); //데이터 소실 0010 0000만 남음
		
		//실수 -> 정수 : 강제형변환(casting);
		double d2;
		int i2;
		d2 = 3.14;
//		i2 = d2;//강제 형변환 필요 실수->정수로
		i2 = (int) d2;//강제형변환 //소숫점 버릴때 가끔 사용함
		System.out.println(i2);
	}
}
