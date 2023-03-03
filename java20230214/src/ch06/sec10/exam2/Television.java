package ch06.sec10.exam2;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info; //복잡한 코드 사용해서 초기화 하고 싶다
	
	static { //info 초기화
		info = company + "-" +model;
	}
}
