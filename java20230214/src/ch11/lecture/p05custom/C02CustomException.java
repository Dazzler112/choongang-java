package ch11.lecture.p05custom;

public class C02CustomException {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception();
		Exception e2 = new Exception("some message");
		
		System.out.println(e.getMessage());//메세지 없으니 아무것도 출력 되지 않고
		System.out.println(e2.getMessage()); //뒤에 some message라고 달았으니 출력 되겠지?
		
		
		throw e2;
	}
}
