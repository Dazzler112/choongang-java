package ch07.lecture.p07sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub021 {
	
}
//상속 받은 클래스는 다시 sealed로 선언 가능
sealed class Sub021 extends Super02 permits Sub0211{}
//final로 해도 되지만 다시 sealed로 해서
//다른 클래스를 명시해서 상속받게 할수도 있다

final class Sub0211 extends Sub021{}
