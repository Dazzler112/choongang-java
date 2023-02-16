package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		long a = 1500000000; //int
		long b = 1700000000; //int로 할경우
		
		System.out.println(a);
		System.out.println(b);
		
		//overflow : 타입의 최대 허용값 벗어남
		long c = a + b;    //아래 int c = a+b하면 21억이상이기 떄문에 넘처흐름
		System.out.println(c);
		
		
		
		long d = -1500000000; //마찬가지로 int로 할경우
		long e = -1700000000; //-30억이상이기 때문에 오버됨
		
		System.out.println(d);
		System.out.println(e);
		//underflow : 타입의 최소값 벗어남
		long f = d + e;    //int f 로 할경우 +10억이 됨 
		System.out.println(f);
	}
}
