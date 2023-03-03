package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car객체 생성
		Car myCar = new Car();
		
		//Car 개게의 필드값 읽기
		System.out.println("모델명: "+ myCar.model);
		System.out.println("모델명: "+ myCar.start);
		System.out.println("모델명: "+ myCar.speed);
		
		Car yourCar = new Car();
		System.out.println("모델명: "+ yourCar.model);
		System.out.println("모델명: "+ yourCar.start);
		System.out.println("모델명: "+ yourCar.speed);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);//100
		System.out.println(yourCar.speed); //yourCar의 속도는?? 0이다
		
		Car hisCar = yourCar;
		yourCar.speed =50;
		System.out.println(yourCar.speed); //50
		System.out.println(hisCar.speed);//hisCar의 속도는?? 50이다
		System.out.println(System.identityHashCode(myCar));
		System.out.println(System.identityHashCode(yourCar));
		System.out.println(System.identityHashCode(hisCar));
	}
}
