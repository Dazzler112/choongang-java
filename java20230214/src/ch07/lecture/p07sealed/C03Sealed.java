package ch07.lecture.p07sealed;

public class C03Sealed {

}
sealed class Super03 permits Sub031{}

//상속받은 클래스는 non-sealed로 선언 가능
non-sealed class Sub031 extends Super03{}
//봉인 해제기능도 가능 super03은 여전히 상속불가지만
//Sub031로 상속 가능

class Sub0311 extends Sub031{}