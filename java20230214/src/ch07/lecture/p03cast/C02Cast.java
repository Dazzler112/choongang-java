package ch07.lecture.p03cast;

public class C02Cast {
	public static void main(String[] args) {
		Super02 o1 = new Sub02();
		Sub02 o2 = (Sub02) o1; //여기까진 문제없음
		
		Super02 o3 = new Super02();
		Sub02 o4 = (Sub02) o3; //o3 상속받은 클래스를 받고싶어서 이렇게 쓴다
							//exception발생
		//코드 에러는 없지만 사용은 불가다(주의에 주의를 요하는 코드) 애초에 sub는 super다 라고 할수 없기에 생긴 문제
		
		
		
		System.out.println("실행코드 이어짐...");
	}
}
class Super02{
	
}

class Sub02 extends Super02{
	
}
