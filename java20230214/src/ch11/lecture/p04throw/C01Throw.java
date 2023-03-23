package ch11.lecture.p04throw;

public class C01Throw {
										//던지는 객체 타입 명시
	public static void main(String[] args) throws Throwable{//던질꺼면 메소드에 던진다는 표시 해 줘야함
		//throwable 타입의 객체를 던질 수 있음
		Throwable a = new Exception();
		
		throw a; //던지는 코드
	}
}
