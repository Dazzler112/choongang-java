package ch07.lecture.p08super;

public class C03Super {

}
class Super03{
	Super03(int i){
		
	}
}
class Sub03 extends Super03{//int받는 생성자 만드니 오류 발생
	Sub03(){
		//자동 삽입되는 상위클래스 기본생성자 호출 코드
		//는 동작하지 않음(왜냐하면 없으니까..)
		//super(); 기본 생성될때 파라미터 없는 애가 생성되니
		//따라서 명시적 호출 해야함
		super(3);//이런식으로 파라미터가 int면 int값 받는것으로 생성
	}
}