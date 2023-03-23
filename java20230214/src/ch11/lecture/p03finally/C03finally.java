package ch11.lecture.p03finally;

public class C03finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if(a) {
				return;
			}
		}finally {//무조건 실행시키고 싶은 코드가 있을때 사용하기도 한다!
			System.out.println("finally block...");
		}
	}
}
