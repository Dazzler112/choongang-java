package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		//연산 중 자동 형변환
		byte b1 = 30;
		byte b2 = 10;
		//값이 범위 안에 포함되니까 그냥 더해도 되지 않겠느냐?
		//ㄴㄴ
//		byte b3 = b1 + b2; //byte, short, char, int의 연산 결과는 int
		// 더할때 값은 어차피 int로 인식
		int i3 = b1 + b2;
		
		byte b4 = (byte) (b1 + b2);//굳이 하고 싶다면 이런식
		byte b5 = 30 + 10;
		
		//정수간의 연산에서 long이 포함된 연산의 결과는 long이다
		long l6 = 30;
		long l7 = 10;
		//8bytes 와 8bytes 더한 값이니 적어도 8bytes는 필요 하겠구나
		long l8 = l6 + l7;
		
		int i9 = 20;
		long l10 = i9 + l7; // int i10 으로 하면 안됨 long이 섞여있으니까
		//굳이 int로 하고싶다? 형변환 ㄱㄱ
		int i10  = (int) (i9 + l7);
		
		//정수와 실수끼리 연산 결과는 실수
		
		int i11 = 30;
		double d11= 3.14;
		double d12 = i11 + d11;//어차피 double 연산자가 들어있으니까 결과값은 더블임
		
		//결론 : 연산의 결과는 큰타입으로 결정된다
	}
}
