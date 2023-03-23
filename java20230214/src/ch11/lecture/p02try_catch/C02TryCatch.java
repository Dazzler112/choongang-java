package ch11.lecture.p02try_catch;

public class C02TryCatch {
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 3;
			
			int c = b/ a;
			
			System.out.println(1); //exception이 발생하지 않았으니 catch는 실행 하지 않음 1이출력
		}catch (ArithmeticException e) {
			System.out.println(2);
		}
		System.out.println("continue...");
	}
}
