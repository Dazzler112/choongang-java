package ch12.lecture.p01object;

public class C18Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println(o1.hashCode());//같은값
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());//같은값
		
		System.out.println(o1.equals(o3)); //같다
		System.out.println(o1.equals(o2)); //해쉬코드 자체도 다르기 때문에..
		//거꾸로 해도 마찬가지
		System.out.println(o3.equals(o1));
		System.out.println(o2.equals(o1));
	}
}
