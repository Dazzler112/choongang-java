package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
		a1.breath();//어떤기능이 동작할것이냐? 당연히 말의 코드블락이 실행되지!
		a2.breath();//이것도 fish의 코드블락이 실행!
	}
}

class Animal{
	public void breath() {
		System.out.println("호흡한다.");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}

class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
	}
}
