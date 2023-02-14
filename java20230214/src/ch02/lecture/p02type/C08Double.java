package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		//실수 
		//float(4bytes), double(8 bytes)
		
		int i1 = 3;
//		i1 = 3.14; //int는 실수 표현 XX
		
		double d1 = 3.14; 
		d1 = 99.9999;
		d1 = 3;
		d1 = 99;
		
		float f1 = 3.14f;//F,f 끝문자로 float literal 표현
		//8바이트에 표현될것을 4바이트에 표현하니까 에러
		// 그래서 숫자 뒤에 f나 F써줘야함
		f1 = 3;
		
		//사용시 주의
		//10진법  -> 2진법 으로 바꿔서 저장 
		//
		double d2 = 0.1; //0.000110011001100..
		double d3 = 0.2; // 0.0011001100110110011.....
		//근사값을 저장했기 때문에 0.3으로 안나옴 이진수로 표현하는 컴퓨터 문제
		double d4 = d2 + d3;
		System.out.println(d4);
		
		//실수 사용할때 왠만하면 double사용(권장)하자
	}
}
