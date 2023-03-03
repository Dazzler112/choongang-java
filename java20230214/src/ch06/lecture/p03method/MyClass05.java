package ch06.lecture.p03method;

public class MyClass05 {
	void method1() {
		//실행코드
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}
	void method3(int line) {
		for(int i = 0; i < line; i++) {
			for(int j =0; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	void method4(int param) {//파라미터도 변수의 일종이다
		int var;			//<-이것과 같다
		var = 3;			//지역변수라 생각
		//파라미터 값을 변경하고싶다?
		int p = param;
		p = 3; //필요하면 옮겨서 써라
		//하지만 파라미터의 값은 변경하지 말아라 좋은습관이 아님 
		System.out.println(param * var);
	}
}
