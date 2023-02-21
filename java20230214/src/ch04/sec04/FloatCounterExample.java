package ch04.sec04;
//웬만하면 정수로 사용하고 실수는 사용하지 말아라
public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
