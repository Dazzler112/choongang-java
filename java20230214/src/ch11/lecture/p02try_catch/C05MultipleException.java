package ch11.lecture.p02try_catch;

public class C05MultipleException {
	public static void main(String[] args) {
		try {
		int[] a = {0 ,1 ,2};
		
		//ArithmaticException
		//ArrayIndexOutOfBoundExceotion
		int c = 3 / a[0];
		//여러 exception 발생할 수 있는경우
		//여러 catch block 작성 가능
		}catch (ArithmeticException e) { //exception이 2개 이상 발생할거 같다 하면
			e.printStackTrace();		//catch 2개 만들어서 사용하면 됨
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
