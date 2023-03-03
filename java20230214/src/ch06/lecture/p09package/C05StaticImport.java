package ch06.lecture.p09package;
import static ch06.lecture.p09package.package1.MyClass05.method1; //조심해서 사용하라 라고 api에 돼있음
import static ch06.lecture.p09package.package1.MyClass05.method2;
import static ch06.lecture.p09package.package1.MyClass05.name;//이렇게 쓰면 MyClass 생략가능
public class C05StaticImport {
	public static void main(String[] args) {
		String n = name;
		
		method1();
		method2();
	}
}
