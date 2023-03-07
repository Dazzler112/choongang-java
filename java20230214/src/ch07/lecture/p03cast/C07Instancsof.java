package ch07.lecture.p03cast;
//인스턴스of 강제형변환 사용시 안전하게 사용가능
public class C07Instancsof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
	}
	public static void action(Animal a) {
		a.breath();
		
		if(a instanceof Horse) {
		//말이면 run();
			Horse h = (Horse) a;
			h.run();
		}else if(a instanceof Fish) {
		//물고기면 swim();
		Fish f = (Fish) a;
		f.swim();
		}else {
		System.out.println("말도 아니고 물고기도 아니다.");
		}
	}
}
