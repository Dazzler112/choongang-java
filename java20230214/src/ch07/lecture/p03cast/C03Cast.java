package ch07.lecture.p03cast;

public class C03Cast {
	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish()); //1.자동 형변환되니 자연스레 실행흐름 이어감..
		
		System.out.println("실행 흐름 이어감...");
	}
	public static void method1(Animal a) {
		a.breath();//2.
		
//		Horse h = (Horse) a;  //3.<-여기서 위험한코드
//		h.run();			//이렇게 사용시 그냥 종료됨
						//근대 horse외에 주석달면 이상은 없음
						
		//말일때만 시작하게 하고싶다
		
		//만약 말 객체이면 실행
		if(a instanceof Horse) {
			Horse h = (Horse) a;
			h.run();
		}
	}
}
