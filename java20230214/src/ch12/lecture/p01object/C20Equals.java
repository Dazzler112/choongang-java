package ch12.lecture.p01object;

public class C20Equals {
	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		Object o4 = o1;
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		System.out.println(o4.hashCode());
		
		System.out.println(o1.equals(o4));
		System.out.println(o1.equals(o3));
		System.out.println(o1.equals(o2));//f
		//해쉬코드가 같으면 무조건 true가 나오냐? 그건 아님
		//하지만 선결조건이 해쉬코드가 같아야 나온다
	}
}
