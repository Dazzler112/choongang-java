package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	//로컬 클래스는 감싸고 있는 메소드의 
	//지역변수(파라미터)를 사용할 수 있다.
	//이때 이 지역변수(파라미터)는 final 이여야 한다.
	
	public static void main(String[] args) {
//		int i = 10; <-이걸 사용하려면 아래처럼
		final int i = 10;
		class LocalClass{//로컬클래스에 지역변수 사용할 일 있다면 그 변수는 final이여야 한다.
			void method1() {
				System.out.println(i);
			}
		}
	}
	public void method1() {
		int i = 1;//effectively final
		i =2; //재정의 불가
		
		class LocalClass{
			void method1() {
				System.out.println(i);
			}
		}
	}
	public void method2(final int param) {//파라미터 int도 fianl이여야 한다
		class LocalClass{
			void method3() {
				System.out.println(param);
			}
		}
	}
	//effectively final parameter
	public void method3(int param) {
		param = 3;//이렇게 다시 선언하면 사실상 final이 아니니까 
		class LocalClass{
			void method4() {
				System.out.println(param);//그럼 이건 사용 못함
			}
		}
	}//그럼 이게 어디서 일어나느냐? 감싸고있는 메소드에만 일어남(즉 지역변수)
}
