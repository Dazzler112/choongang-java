package ch12.lecture.p03math;

public class C01Math {
	public static void main(String[] args) {
		//Math class : 수학연산에 필요한 메소드를 가진 클래스
		//모두 static method
		
		//random
		
		//round : 반올림
		long l1 = Math.round(3.5);//round는 타입이 long타입이다
		System.out.println(l1);
		
		long l2 = Math.round(3.14);
		System.out.println(l2);
		
		//ceil : 올림
		double d1 = Math.ceil(3.5);
		System.out.println(d1);
		double d2 = Math.ceil(3.1);
		System.out.println(d2);
		
		//floor : 버림
		double d3 = Math.floor(3.14);//이것도 리턴 double
		System.out.println(d3);
		double d4 = Math.floor(3.9);
		System.out.println(d4);
		
		//max : 둘중에 큰 값
		double d5 = Math.max(3.14, 3.5);//기본 타입 넣은거에 따라 리턴타입 달라짐
		long d6 = Math.max(300l,500l);
		int d7 = Math.max(5, 3);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		
		//min : 둘중에 작은값
		double d8 = Math.min(3.14, 3.5);
		long d9 = Math.min(30l, 50l);
		int d10 = Math.min(5, 3);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
	}
}
