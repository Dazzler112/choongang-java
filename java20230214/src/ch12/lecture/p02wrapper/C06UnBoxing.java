package ch12.lecture.p02wrapper;
//비교
public class C06UnBoxing {
	public static void main(String[] args) {
		int i1 = 300000;
		int i2 = 300000;
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		System.out.println(o1 == o2);
		
		int i3 = o1;
		int i4 = o2;
		
		System.out.println(i3 == i4);//참조타입인지 기본타입인지 알고 == 나 equals 쓸것
		//이건 기본타입이니까
	}
}
