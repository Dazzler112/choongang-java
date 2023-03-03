package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();
		int var1 = o1.method1();//메소드 호출했으니 해당 변수 만들어 줘야함
		
		System.out.println(var1);
		
		int var2 = o1.method1() * 2;
		System.out.println(var2);
		
		System.out.println(o1.method1());
		
		String var3 = o1.method2();
		System.out.println(var3);
		String var4 = o1.method2() + "java";
		System.err.println(var4);
		System.out.println(o1.method2());
		
		//자동 형 변환
		
		long var5 = o1.method1(); //long 가능
	}
}
