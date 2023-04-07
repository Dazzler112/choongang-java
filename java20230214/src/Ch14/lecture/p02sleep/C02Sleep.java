package Ch14.lecture.p02sleep;

public class C02Sleep {
	public static void main(String[] args) {
		System.out.println("메인쓰레드 시작");
		
		Thread t = new Thread (() -> {
			System.out.println("쓰레드 시작");
			
			try {
				Thread.sleep(2000); //현재 진행하는쓰레드를 멈출때 사용
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("쓰레드 종료");
		});
		t.start();
		
		System.out.println("메인쓰레드 종료");
	}
}
