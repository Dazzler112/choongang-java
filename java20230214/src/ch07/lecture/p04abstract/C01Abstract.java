package ch07.lecture.p04abstract;

public class C01Abstract {
//클래스는 있는대 인스턴스 시키고 싶지 않을때 사용
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
		Animal a3 = new Animal();//이건 추상적으로 남기고싶지 인스턴트 시키고 싶지 않다..
		//animal 클래스 가서 abstract 붙이면 인스턴스 불가능하게 만듦
	}

}
