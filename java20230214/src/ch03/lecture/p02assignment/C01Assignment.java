package ch03.lecture.p02assignment;

public class C01Assignment {
	public static void main(String[] args) {
		//할당(대입) 연산자
		// =, += , -= , *=, /= , %=
		
		int x = 10;
		
		x += 30;// x = x+30 이식과 같다
		System.out.println(x);
		
		x -= 20;// x= x-20;
		System.out.println(x);
		
		x*= 3; // x = x * 3; //왜 할당연산자가 더 나중에 계산되느냐? 우선순위가 낮으니까
		System.out.println(x);
		
		x /= 7 ; // x = x/7
		System.out.println(x);//8.xxxxx인대 int끼리 계산이여서 8임
		
		x %= 3; //x = x % 3
		
		System.out.println(x);
	}
}
