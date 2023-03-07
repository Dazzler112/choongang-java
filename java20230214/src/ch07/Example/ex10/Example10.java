package ch07.Example.ex10;

public class Example10 {

}

public abstract class Machine {
	public void powerOn() {}
	public void powerOff() {}
	public abstract void work();//컴퓨터 클래스에 재정의를 하지 않아서 	
}								//컴파일러 오류 발생
								//혹은 컴퓨터 클래스를 추상클래스로 바꿔야함
public class Computer extends Machine{
	@Override
	public void work() {
		System.out.println("기계가 돌아 갑니다...");
	}
}
