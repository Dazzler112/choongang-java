package ch06.lecture.p10access.package1;
//접근제한자 기본(default)
public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		System.out.println(o1.name);//퍼블릭이니 어디든가능
		System.out.println(o1.age);//불가능 private니
		System.out.println(o1.married); //이번에는 가능 할까? yes 같은 패키지여서
		
		o1.method1();//public 가능
		o1.method2();//불가능
		o1.method3();//default지만 같은패키지여서 가능!
	}
}
