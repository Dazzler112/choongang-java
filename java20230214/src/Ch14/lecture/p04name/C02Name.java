package Ch14.lecture.p04name;

public class C02Name {
	public static void main(String[] args) {
		for(int i = 0; i<3; i++) {
		Thread t1 = new Thread(() -> {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		});//for문 돌때마다 이름 지어주는대 바뀐다
		t1.start();
		}
	}
}
