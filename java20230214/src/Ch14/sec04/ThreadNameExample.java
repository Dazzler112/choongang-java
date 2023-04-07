package Ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i = 0; i < 3; i++) {
			Thread threaA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threaA.start();
		}
		Thread chartThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		 chartThread.setName("chat-thread");
		 chartThread.start();
	}
}
