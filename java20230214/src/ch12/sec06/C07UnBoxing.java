package ch12.sec06;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000; //auto boxing
		int r1 = i1 + 50000; //unboxing
		
		System.out.println(r1);
		
		Object o1 = 30000; //auto boxing, type conversion
//		int r2 = o1 + 50000; //xx 오브젝트는 인티저값이 없으니 형변환 하고 써야겠지?
		int r3 = ((Integer) o1) + 50000;//할거면이거 근대 굉장히 위험한 코드다!
		int r4 = ((int)o1) + 50000; //이것도 위험
		
		System.out.println(r3);
		System.out.println(r4);
	}
}
