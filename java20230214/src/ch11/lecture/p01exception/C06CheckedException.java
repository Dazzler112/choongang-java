package ch11.lecture.p01exception;

public class C06CheckedException {
	public static void main(String[] args) {
		try {
		Class.forName("java.lang.Object"); //이렇게 아래에 빨간줄로 체크돼있으면 checked exception
		
		}catch (ClassNotFoundException e) {//checked exception 발생시 이런 구조를 짜야함
			e.printStackTrace();		//어떤 코드가 발생하느냐에 따라 코드 작성할수도 안할수도 있다.
		}
		
		System.out.println("continue...");
	}
}
