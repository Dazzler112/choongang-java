package ch06.lecture.p03method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동형변환
		int a = 3;
		long b = a;
		double c = b;
		char d = 'a';
		int e = d;
		//여기도 자동형변환 가능하다
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c');//왜 됨? 자동 형변환 되니까
		
		o1.method2(29387482874982734L);
		o1.method2(33);
		o1.method1('d');
		
		o1.method3(3.14);
		o1.method3(29387482874982734L);
		o1.method3(55);
		
		o1.method4(3.14f); //되고
		o1.method4(298342L); //되고
		o1.method4(99); //되고
//		o1.method4(3.14); //안되고
	}
}
