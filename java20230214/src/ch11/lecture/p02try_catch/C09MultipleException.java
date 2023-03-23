package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		
		try {
			//여러 exception 발생 가능
		}catch(ArithmeticException e) {
			e.printStackTrace(); //이것처럼 하는 일이 같다면 상위타입을 잡아도 되고
		}catch(NumberFormatException | NullPointerException e) {
			e.printStackTrace(); 			//이것처럼 or 처럼 사용하면 가능
		}
		
		
	}
}
