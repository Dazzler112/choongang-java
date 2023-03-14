package ch12.lecture.p01object;
//hashcode 라벨을 붙여준다 생각하면 됨
public class C14Hashcode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
