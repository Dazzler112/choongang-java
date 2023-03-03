package ch06.lecture.p09package;

import static ch06.lecture.p09package.package1.MyClass05.*;//스태틱도 가능하다
//import static ch06.lecture.p09package.package1.MyClass05.name;
//import static ch06.lecture.p09package.package1.MyClass05.method1;
//import static ch06.lecture.p09package.package1.MyClass05.method2;
public class C07StaticImportAll {
	public static void main(String[] args) {
		String n = name;
		method1();
		method2();
	}
}
