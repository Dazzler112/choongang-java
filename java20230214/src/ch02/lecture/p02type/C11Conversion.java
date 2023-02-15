package ch02.lecture.p02type;

public class C11Conversion { //자동 타입변환
	public static void main(String[] args) {
		int i1;
		long l1;
		
		i1 = 100;
		l1 = i1; //작은타입꺼 옮겨담는대 문제 없음
		
		float f1;//4bytes
		double d1; //8bytes
		
		f1 = 3.14f;
		d1 = f1; //문제 없음
		
		//정수 타입간에 작은타입 -> 큰타입 :자동형변환  이상없음
		//정수에서 실수로 : 자동 형변환
		
		int i2;
		double d2;
		
		i2 = 999999;
		d2 = i2; //정수에서 실수로 자동 형 변환
		
		long l2;
		l2 = 999999999999L;
		d2 = l2; //정수에서 실수로 자동 형변환
		System.out.println(d2);
		
		float f2; //4bytes
		
		f2 = l2;
		System.out.println(f2); //데이터 소실이 있으니 주의!!
		
		//문자(char)에서 정수(int,long)으로 자동 형변환
		char c3 = '가';
		int i3 = c3;//자동형변환 (2bytes -> 4bytes)
		long l3 = c3;//자동형변환 (2bytes -> 8bytes)
		//char 에서 short는왜 안되냐?? short는 음수까지 표현하고 해서 안됨
	}
}
