package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	public static void method2() throws Exception{//된다 <-여기는 해당타입 및 상위 타입이 오면 되겠구나!?
		throw new ClassNotFoundException();
	}
	public static void method1() throws RuntimeException{//된다 (다항성)
		throw new ClassCastException();
	}
}
