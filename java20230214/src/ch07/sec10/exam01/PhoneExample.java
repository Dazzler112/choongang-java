package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); //인스턴스화 불가능하게 선언했음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone p = smartPhone; //p p 는 안되지만 p = sp는 된다
		p.turnOn();
		p.turnOff();
		p.internetSearch();//이건 smartphone 에 있는 메소드여서 불가
		
	}
}
