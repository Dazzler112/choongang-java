package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생
		}
		//catch에 상위 exception을 사용하면 아래 하위는 쓸모없는 코드가 되어버린다
		catch (RuntimeException e){ 
			//아래 catch블럭의 execption 보다
			//상위 타입의 exception catch블럭을 먼저 작성할 수 없다.(다형성 때문에)
			e.printStackTrace();
		}
		catch (ArithmeticException e){
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("continue...");
	}
}
