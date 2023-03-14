package ch12.lecture.p01object;

public class C04ToString {
	public static void main(String[] args) {
		Object o1 = "java";
		Object o2 = new String("java");
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2)); //역시 둘이 참조값 다르다
		
		//그럼 toString도 다르게 나오곘느냐?
		
		System.out.println(o1.toString()); //String에서 재정의 되기 때문에
		System.out.println(o2.toString());  //API보면 자기자신을 리턴한다고 설명돼 있음
		//그럼 우리 객체를 표현하도록 재정의 할 수 있겠다?
	}
}
