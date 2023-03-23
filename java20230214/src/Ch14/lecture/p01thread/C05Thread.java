package Ch14.lecture.p01thread;

public class C05Thread {
	public static void main(String[] args) {
		Thread t1 = new MyThread5();
		t1.start();
		while(true) {
			System.out.println("@@@@@@@@@@@@ main thread @@@@@@@@@@@@@@@@");
		}
	} //동시에 실행 되는거지만 콘솔이 1개여서 번갈아가면서 출력됨
}

//thread 만드는 두번째 방법
//thread 클래스 상속
//run메소드 재정의
class MyThread5 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("####쓰레드 작업중 ####");
		}
	}
}
//우리가 직접 쓰레드 작성할 일은 없다! ....지만 진짜?