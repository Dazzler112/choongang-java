package ch11.lecture.p02try_catch;

public class C01TryCatch {
	public static void main(String[] args) {
	
		try {//exception 발생할 수 있는 코드 작성 
			int a = 0; //실행시키고
			int b = 3; //실행시키다가
			
			int c = b / a;  //exception이 발생하는 곳 여기서 아래로 바로 던짐
	}catch(ArithmeticException e) {
		//발생한 exception을 잡아서 실행하는 코드 작성
//		e.printStackTrace();
		System.out.println(2);
	}
		System.out.println("continue....");
	}
}
