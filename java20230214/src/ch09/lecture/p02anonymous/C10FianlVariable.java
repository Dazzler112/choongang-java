package ch09.lecture.p02anonymous;

public class C10FianlVariable {
	int j; //필드에는 effectively fianl 통하지 않음 
	
	public void method1() {
		int i;//effectively final
		j = 99;//ok 통하지 않음
		j = 100;//ok
		class LocalClass{
			void method2() {
				System.out.println(i);
				System.out.println();
			}
		}
	}
}
