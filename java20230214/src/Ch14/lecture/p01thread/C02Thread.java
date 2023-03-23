package Ch14.lecture.p01thread;

public class C02Thread {
	public static void main(String[] args) {
		Process01 p1 = new Process01();
		Thread t1 = new Thread(p1);//스레드에 러너블 받는 파라미터있음
		t1.start();//적절한 순간에 run이라는 메소드를 실행시켜 준다
	}
}

class Process01 implements Runnable {
	@Override
	public void run() {
		System.out.println("업무 진행~~!");	
	}
}
