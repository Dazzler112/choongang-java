package ch11.lecture.p02try_catch;

public class C07MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0,1};
			//ArithmeticException
			//ArrayIndexOutOfBoundsException
			int c = 3 / a[0];
			
		}catch (Throwable e) {//상위타입으로 만들면 catch 2개 만들 필요가 없다
			e.printStackTrace();
		}
	}
}
