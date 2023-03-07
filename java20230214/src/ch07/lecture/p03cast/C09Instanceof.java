package ch07.lecture.p03cast;

public class C09Instanceof {
	public static void main(String[] args) {
		
	}
	public static void action(Animal a) {
		a.breath();
		if(a instanceof Horse h) {//패턴매칭으로 간결하게 만들었음
			h.run();
		}else if (a instanceof Fish f) {
			f.swim();
		}else {
			System.out.println("물고기도 아니고 말도아니다.");
		}
	}
}
