package ch06.lecture.p10access;
//class 접근 제한자
public class C06AccessModifier {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		//안됨 (MyClass07은 package private기 때문에)
		ch06.lecture.p10access.package1.MyClass07 o2 = new ch06.lecture.p10access.package1.MyClass07();
	}
}
