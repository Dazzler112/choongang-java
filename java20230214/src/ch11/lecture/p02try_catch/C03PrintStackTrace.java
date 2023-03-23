package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			int c = b / a;
			
			System.out.println("try block continue...");
		}catch (ArithmeticException e) {
			//catch block
//			System.out.println("예외발생!!!!");
			//예외가 발생했다는 흔적은 꼭 남겨줘야함
			//그래야 어디 부분이 잘못됐는지 케치하는대 빠르기 때문
			e.printStackTrace(); //별일 없으면 이걸 꼭 호출해라
		}
		System.out.println("program continue...");
	}
}
