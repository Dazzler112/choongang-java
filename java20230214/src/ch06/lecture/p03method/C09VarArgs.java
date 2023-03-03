package ch06.lecture.p03method;

public class C09VarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
		o1.method1();
		o1.method1(3);
		o1.method1(5,7);
		
		//method2는 배열을 받으니까
		o1.method2(new int[] {});
		o1.method2(new int[] {3});//{}알다시피 배열 길이
		o1.method2(new int[] {9, 10});
		o1.method2(new int[] {100,200,300});
		
		o1.method3(); //호출할때 파라미터 안넣어도 되고
		o1.method3(5);
		o1.method3(100,200);
		o1.method3(99, 88, 77, 66 ,55);
		
		//받는쪽에서는 어떻게 해야하냐? class9로
		o1.method3(new int[] {0,3,5,9}); //배열을 줘도 되지만 거의 안쓴다
	}
}
