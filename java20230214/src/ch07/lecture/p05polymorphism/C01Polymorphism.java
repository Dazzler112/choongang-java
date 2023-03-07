package ch07.lecture.p05polymorphism;

public class C01Polymorphism {

	public static void main(String[] args) {
		Integer i1 = new Integer(33); //사용되길 권장하지 않는 
		Integer i2 = new Integer("33");
		
		Number n1 = i1; //넘버에도 가능하고
		Number n2 = i2;
		
		Object o1 = i1;//object에도 가능하다
		Object o2 = i2;
		
		Number ne = new Number();//추상클래스이기 때문에 인스턴스 불가(API참고)
	}

}
