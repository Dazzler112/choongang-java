package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		//실수를 0으로 나누면 무한대(Infinity)
		
		double a = 0.0;
		double b = 3.0;
		
		double c = b /a ;
		System.out.println(c);
		
		double d = -3.0;
		
		double e = d / a;
		
		System.out.println(e); //음의 무한대
		
		//실수를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0 ; //NaN(Not a Number)
		System.out.println(f);
		
		double g = f + 1.0;//NaN에 어떤 연산을 해도 NaN임
		System.out.println(g);//infinity도 마찬가지
		
		//무한대인지 확인
		boolean isInfinite1 = Double.isInfinite(c);
		System.out.println(isInfinite1);
		
		boolean isInfinite2 = Double.isInfinite(3.0);
		System.out.println(isInfinite2);
		
		//NaN인지 확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1);
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2);
	}
}
