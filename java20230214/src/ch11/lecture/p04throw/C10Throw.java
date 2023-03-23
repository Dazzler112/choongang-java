package ch11.lecture.p04throw;

public class C10Throw {
	public static void main(String[] args) throws ClassNotFoundException{
		method2(); //얘도 안잡을꺼면 던져도 된다
	}
	public static void method2() throws ClassNotFoundException{
		method1();//얘가 잡지 않는다면 얘도 던질수 있다 
	}
	public static void method1() throws ClassNotFoundException{
		
	}
}
