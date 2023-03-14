package ch12.lecture.p01object;

public class C19Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass19();
		Object o2 = new MyClass19();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		System.out.println(o1.equals(o3));
		System.out.println(o1.equals(o2));
		System.out.println(o3.equals(o1));//거꾸로 해도 결과는 같다
	}
}

class MyClass19 {
	@Override
	public int hashCode() {
		return 33;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;//어떤 객체가 들어와도 무조건 트루로 만들고 싶다?
		//해쉬코드도 같은값 받도록 재정의 해줘야한다 위의 해쉬코드 메소드 보기
	}
}
