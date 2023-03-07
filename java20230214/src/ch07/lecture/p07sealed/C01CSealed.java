package ch07.lecture.p07sealed;

public class C01CSealed {
//대부분 회사는 자바 버전 낮은걸 쓰기 때문에 그냥 편하게 들어라
	public static void main(String[] args) {
		
	}

}
//sealed class : 특정 클래스만 상속 허용
sealed class Super01 permits Sub011,Sub012{//어디까지만 할수있다고 제한
	
}
//sealed class를 상속한 클래스는 final로 선언
final class Sub011 extends Super01 {
	
}
final class Sub012 extends Super01{}

final class Sub013 extends Super01{}//11,12만 허용되고 13은 불가