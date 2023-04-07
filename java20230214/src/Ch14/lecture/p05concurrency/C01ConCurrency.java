package Ch14.lecture.p05concurrency;

//쓰레드의 문제점 및 해결방안(?)
public class C01ConCurrency {
	static int field = 0;

	public static void main(String[] args) {
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}
		}, "A Thread");

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				field++;
			}
		}, "B Thread");
		// 20만이 되겠는가? 안된다 왜?여러쓰레드가 어떤 객체의 값(상태)를 주의를 요해야한다
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// *중요*//
		/*
		 * 여러 쓰레드가 하나의 객체 상태를 변경하려고할때* 매우 주의해서 코드를 작성해야 한다.
		 */

		// 해결책1 : 여러쓰레드가 하나의 객체 상태를 변경하는 코드를
		// 작성하지 않는게 가장 안전한 방법이다.*
		System.out.println(field);
	}
}