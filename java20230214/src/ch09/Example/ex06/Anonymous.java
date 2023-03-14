package ch09.Example.ex06;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	void method2(Vehicle v) {//v에 어떤 인터페이스가 들어오는지 상관 없다 추상에서 재정의 할태니까 안그러면 오륜대?
		v.run();
	}
}
