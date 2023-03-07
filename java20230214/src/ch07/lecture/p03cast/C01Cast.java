package ch07.lecture.p03cast;

//강제로 형변환 시킴 대신 이방법은 데이터가 소실됨(위험함)
public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
//		a1.run(); // xx

		Horse h1 = (Horse) a1; // 강제 형변환 (type cast)
		h1.run(); // ok
		
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim(); // xx
		
		Fish f1 = (Fish) a2; // 강제형변환 (type casting)
		f1.swim(); // ok
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}
}
