package Ch14.lecture.p01thread;

public class C01Thread {
	public static void main(String[] args) {
		//Thread 만들기
		Thread t1 = new Thread();
		
		//Thread 시작
		t1.start(); //시작하면서 2스레드 분기 생김
		
		//thread 만들기
		Thread t2 = new Thread();
		//Thread 시작
		t2.start(); //시작하면서 3스레드 분기 생김
	}
}
