package ch06.lecture.p02field;

public class C02Field {
public static void main(String[] args) {
	MyClass02 var1 = new MyClass02();
	System.out.println(var1.age); //클래스는 초기화되지 않은값도 사용가능
	System.out.println(var1.married);
	System.out.println(var1.name);
	//초기화 되지 않은 변수 사용 불가
	/*int a;
	System.out.println(a);
	*/
	}
}
