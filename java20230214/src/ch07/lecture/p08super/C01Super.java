package ch07.lecture.p08super;
//내용은 어렵지만 한번듣고 잊어버려도 된다
public class C01Super {
	Sub01 o1 = new Sub01();
}

class Super01{
	//이 클래스로 인스턴스 만들 때 해야하는 일 1
	Super01(){
		System.out.println("상위클래스 초기화 코드");
	}
}
class Sub01 extends Super01{
	
	Sub01(){
		//그 전에 상위클래스의 초기화 작업을 먼저 해야함 2-1
		//상위 클래스 생성자 호출 코드
		super();//꼭 먼저 해야함(작성 하지 않으면 자동으로 삽입됨)
		//이 클래스로 인스턴스 만들 때 해야하는 일 2-2
		System.out.println("하위클래스 초기화 코드");
		//근대 여태것 super();안쓰고 잘 써왔는대? 자동 삽입되기 때문
	}
}
