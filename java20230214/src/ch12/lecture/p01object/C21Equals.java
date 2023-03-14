package ch12.lecture.p01object;
//해쉬코드 equals 재정의 해보자
public class C21Equals {
	public static void main(String[] args) {
	Object o1 = new MyClass21(5);
	Object o2 = new MyClass21(5);
	Object o3 = new MyClass21(6); //o3에 6이라는 다른 값을 줬지만 생성된 생성 인스턴스가 틀리기 때문에 false
	
	System.out.println(o1.hashCode());
	System.out.println(o2.hashCode());
	System.out.println(o3.hashCode());
	
	System.out.println(o1.equals(o2));
	//물리적으로 같다고 하면 같다고 정의하겠다 라고 하고싶으면 아래 클래스 계속 1-1
	System.out.println(o1.equals(o3));//false로 리턴되는 이유가 
				//o1과 o3의 인스턴스 생성자 값이 다르기 때문에 	
			//생성자 값이 달라 버리기 때문에 해쉬코드가 5리턴으로 해도 다르다
	}
}
class MyClass21{
	private int id;
	
	MyClass21(int id){
		this.id = id;
	}
	@Override//1-3 해쉬코드 재정의해준다 리턴값을 줘버린다
	public int hashCode() {
		return 5;
	}
	@Override//1-1계속
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof MyClass21 o) {
			return this.id == o.id; //근대 이렇게 하면 o1 o2 해쉬코드가 틀렸는대도 true가 나옴 그러면 위에 재정의
		}
		return super.equals(obj);
	}
}