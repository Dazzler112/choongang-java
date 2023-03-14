package ch09.Example.ex04;

public class CarExample {
	public static void main(String[] args) {
		Car Mycar = new Car();
		Car.Tire tire =  Mycar.new Tire();//거의  볼일 없다
		Car.Engine engine = new Car.Engine(); //한 이거 정도 쓸까...?
	}
}
