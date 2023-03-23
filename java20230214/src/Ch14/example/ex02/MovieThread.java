package Ch14.example.ex02;

public class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);//sleep은 적은 숫자 동안 슬립상태
			}catch (Exception e) {
			}
		}
	}
}
