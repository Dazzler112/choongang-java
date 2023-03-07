package ch08.example.ex5;

public class TV implements Remocon{
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");	
	}
	public static void main(String[] args) {
		Remocon rc = new TV();
		rc.powerOn();
	}
}
